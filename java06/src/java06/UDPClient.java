package java06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(5000);
		System.out.println("UDP client start....");
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("UDP wait...");

		socket.receive(packet);
		System.out.println("data receive..");
		//
		String s = new String(data);

		System.out.println("received data: " + s);
	}

}
