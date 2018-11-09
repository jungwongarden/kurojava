package java15;

import java.util.Scanner;

public class ArrayTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int[] num = new int[10];
		
		for (int i= 0; i < num.length; i++) {
			System.out.print("점수 입력: ");
			num[i] = sc.nextInt();
		}
		
		for (int x : num) {
			System.out.print(x + " ");
		}
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		System.out.println();
		System.out.println("입력한 값 들 의 합은 " + sum);
	}
}
