import java.rmi.*;
import java.rmi.registry.*;


public class RmiServer {
	private static final String host = "localhost:5000";
	public static void main(String [] args)  {
		
		try {
			Adder a = new AdderImpl();
			
			String rmiObject = "rmi://" + host + "/hello";
			
			Naming.rebind(rmiObject, a);
			
			System.out.println("Binding Successfull");
		} catch(Exception ex) {
			System.out.println("Error in Binding");
			System.out.println(ex);
		}
			
		}
}
