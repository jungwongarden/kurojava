package java06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient3 {

	public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 9100);
        System.out.println("client start!!!");
        BufferedReader input =
            new BufferedReader(new InputStreamReader(s.getInputStream()));
        String res = input.readLine();
        System.out.println("received data from server:" +  res);
        
        
        //internet.read();
        //print("test");
        
        //System.exit(0);

	}

}
