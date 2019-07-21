package 배열;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		//성적 관리 프로그램
		int[] jumsu = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("점수 입력>> ");
			int data = sc.nextInt();
			jumsu[i] = data;
		}
		
		System.out.println("점수 출력------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
	}
}
