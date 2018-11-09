package java06;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest2 {

	public static void main(String[] args) {
		String name = "www.daum.net";
		try {
			InetAddress url = InetAddress.getByName(name);
			System.out.println("인터넷 주소: " + url);
			System.out.println("IP주소: " + url.getHostAddress());
			
		} catch (UnknownHostException e) {
			System.out.println("에러 발생!!!");
			System.out.println("그런 인터넷 주소가 없어요.");
		}
	}

}
