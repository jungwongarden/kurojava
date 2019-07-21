package 조건문;

import java.util.Scanner;

public class 스트링비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 2개 입력>> ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.equals(s2)) {
			System.out.println("동일");
		}else {
			System.out.println("동일X");
		}
		System.out.print("인생 좌우명 입력: ");
		sc.nextLine(); //enter
		String life = sc.nextLine();
		System.out.println("입력한 좌우명: " + life);
	}

}
