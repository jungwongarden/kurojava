package loop;

import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값을 입력>> ");
		int start = sc.nextInt();
		System.out.print("끝날값을 입력>> ");
		int end = sc.nextInt();
		int sum = 0;
		
		while (start <= end) {
			sum = sum + start;
			start++;
		}
		
		System.out.println("시작값: " + start + "부터 " 
					+ "종료값: " + end + "까지의 합은 " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
