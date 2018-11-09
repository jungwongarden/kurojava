package cal;

import java.util.Scanner;

public class Today3 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		System.out.print("숫자1>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2>> ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int rest = num1 % num2;
		
		System.out.println("두 수의 합은 " + sum);
		System.out.println("두 수의 차는 " + minus);
		System.out.println("두 수의 곱은 " + mul);
		System.out.println("두 수의 나눗셈은 " + div);
		System.out.println("두 수의 나머지는 " + rest);
		
		
		
		
		
		
		
		
		
	}

}
