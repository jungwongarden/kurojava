package java06;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(9100);
		System.out.println(server.toString()); //server info.
		
		
		System.out.println("TCP Server Start.");
		System.out.println("Wait.......");
		System.out.println("======================");
		

		while(true) { 
			Socket socket = server.accept();
			System.out.println("conntect start..!!");
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Welcome....I am Server");
			socket.close();
			System.out.println("data send..!!!!");
			System.out.println("connect end..!!!!");
		}
		
		
		
		
		
		
		
		
		
		//3. �겢�씪�씠�뼵�듃濡� �젙蹂� �쟾�넚.
	}

}
