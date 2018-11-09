package java06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		
		String s = "I am JAVA Programmer";
		byte[] data = s.getBytes(); 
		InetAddress	ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);
		socket.send(packet);
		System.out.println("server data send....");
		
		socket.close();	
		
	}

}
