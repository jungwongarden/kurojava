package 반복문;

import java.util.Scanner;

public class WhileTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("입력(종료 0): ");
			int data = sc.nextInt();
			if(data == 0) {
				System.out.println("프로그램 종료.");
				break; //반복문 종료
			}
			System.out.println("확인: " + data);
			//sum에다가 입력값 계속 더해보세요.
			sum = sum + data;
			//여기까지의 sum값을 출력.
			System.out.println("여기까지의 합" + sum);
		}
		System.out.println("최종합은 " + sum);
	}
}
