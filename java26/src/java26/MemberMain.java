package java26;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		Member m = new Member();
		System.out.println("회원가입 정보를 넣어주세요.");
		System.out.print("회원ID: ");
		String id = sc.next();
		System.out.print("회원PW: ");
		String pw = sc.next();
		System.out.print("회원NAME: ");
		String name = sc.next();
		System.out.print("회원AGE: ");
		int age = sc.nextInt();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setAge(age);
		
		PrintMain p = new PrintMain();
		p.print(m);
	}
}
