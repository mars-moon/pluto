package middlewareconnector;

public class Client {
	public static void main(String [] args) {
		InterfaceCal cal = new Server();
		System.out.println("Addition: " + cal.add(12, 32));
		System.out.println("Multiplication: " + cal.mul(12, 12));
	}
}
