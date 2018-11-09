package loop;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 >> ");
		int num1 = sc.nextInt();

		System.out.print("종료값 >> ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println("합>> " + sum);
	}
	

}
