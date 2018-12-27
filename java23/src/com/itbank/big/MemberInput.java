package com.itbank.big;
import java.util.Scanner;
public class MemberInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[3];
		int count = 0;
		while (true) {
			System.out.println("회원가입을 진행하시겠습니까? 입력: 1, 종료: 0");
			int input = sc.nextInt();
			if (input == 0)
				break;
			System.out.println("회원 가입 정보를 넣어주세요.");
			System.out.println("---------------------");
			System.out.print("ID: ");
			String id = sc.next();
			String pw = sc.next();
			System.out.print("NAME: ");
			String name = sc.next();
			System.out.print("AGE: ");
			int age = sc.nextInt();
			members[count] = new Member(id, pw, name, age);
			count++;
			System.out.println("당신이 입력한 정보는 아래와 같습니다.");
		}
	}
}
