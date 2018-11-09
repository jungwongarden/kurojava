package cal;

import java.util.Scanner;

public class Today6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		System.out.print("숫자1>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2>> ");
		int num2 = sc.nextInt();
		
		boolean result;
		//조건의 결과의 타입은 boolean
		System.out.println(num1 == num2);
		
		if (num1 == num2) {
			result = true;
		} else {
			result = false;
		}
		System.out.println("두 수가 같은 가요>> " +  result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
