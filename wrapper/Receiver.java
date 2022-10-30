package wrapperDemo;

import java.net.*;
public class Receiver {
	public static void main(String [] args) throws Exception{
		System.out.println("Waiting for sender to send some message");
		
		DatagramSocket socket = new DatagramSocket(3000);
		
		byte[] buffer = new byte[1024];
		
		DatagramPacket packet = new DatagramPacket(buffer, 1024);
		
		socket.receive(packet);
		
		String received_message = new String(packet.getData(), 0, packet.getLength());
		
		System.out.println("Message Received Syuccessfully");
		System.out.print(received_message);
		
		socket.close();
	}
}
