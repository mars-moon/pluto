package wrapperDemo;

import java.net.*;
import java.util.*;
public class Sender {
	public static void main(String [] args) throws Exception{
		
		System.out.println("Enter your message here: ");
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		DatagramSocket socket = new DatagramSocket();
		
		InetAddress ip_address =  InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), ip_address, 3000);
		
		socket.send(packet);
		socket.close();
		scn.close();
		
		System.out.println("Message Sent Successfully");
	}
}
