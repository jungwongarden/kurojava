package java16;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		//1. 구하고자 하는 값 들을 배열에 넣어라.
		int[] num = new int[10];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("값을 입력>> ");
			num[i] = sc.nextInt();
		}
		
		int min = num[0];
		//2. 배열을 순회하면서 최소값을 구하면 됨.
		for (int i = 0; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		//3. 최소값만 계속 유지시키는 임의의 변수를 하나 만들어라.
		//4. 순회하면서 최소값유지변수와 값을 비교!
		//	 값이 작은 경우만 해당 배열의 값을 최소값유지변수에 넣으면 됨.
		System.out.println("최소값은 " + min);
		
	}

}
