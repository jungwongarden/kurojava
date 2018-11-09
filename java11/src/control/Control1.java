package control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
	
		Scanner	sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		int max;
		
		if(input1 > input2) {
			max = input1;
		} else {
			max = input2;
		}
		
		
		System.out.println("두 수중 최대값은 " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
