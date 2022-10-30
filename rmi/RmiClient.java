import java.rmi.ConnectException;
import java.rmi.Naming;

public class RmiClient 
{
	
	private static final String host = "localhost:5000";
	public static void main(String [] args) 
	{
		try 
		{
			
//			Adder a = (Adder) Naming.lookup("rmi://" + host + "/hello");
			Adder greeting_message = (Adder) Naming.lookup("rmi://" + host + "/hello");
			 
			System.out.println("Addition: " + greeting_message.add(12, 12));
			
		} catch (ConnectException con) {
			System.out.println("Connection Expection Occured. Exceptiopn: " + con);
			System.exit(1);
		} catch(Exception e) {
			System.out.println("Some Exception Occured. Exception: " + e);
			System.exit(1);
		}
	}
}
