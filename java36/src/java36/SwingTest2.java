package java36;

import java.util.ArrayList;

public class SwingTest2 {

	public static void main(String[] args) throws Exception {
		MemberDAO2 dao = new MemberDAO2();
		dao.login("test", "test");
		System.out.println();
		dao.login("win", "win");
		
	}
}
