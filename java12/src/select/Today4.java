package select;

import java.util.Scanner;

public class Today4 {

	public static void main(String[] args) {
		final String ID = "root";//100
		final String PW = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id: ");
		String id = sc.next();//200
		System.out.print("pw: ");
		String pw = sc.next();
		
		
		if (id.equals(ID) && pw.equals(PW)) {
			System.out.println("로그인 OK");
		} else {
			System.out.println("로그인 NOT");
		}
	}

}
