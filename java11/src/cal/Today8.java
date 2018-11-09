package cal;

import java.util.Scanner;

public class Today8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		String input = sc.next();
		char c1 = input.charAt(5);
		char c2 = input.charAt(6);
		char c3 = input.charAt(7);
		System.out.println("" + c1 + c2 + c3);
		
		String rrn = sc.next();
		
		char c4 = rrn.charAt(7);
		
		if(c4 == '1' || c4 == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		
		int num = 3;
		int num2 = -num; //1항 연산자
     					 //(단항 연산자)
		
		
						  
						  
						  
		
		
		
		
		
		
		
		
		
	}

}
