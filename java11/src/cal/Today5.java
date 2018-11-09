package cal;

import java.util.Scanner;

public class Today5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 수를 입력하세요.");
		System.out.print("숫자1>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2>> ");
		int num2 = sc.nextInt();
		System.out.print("숫자3>> ");
		int num3 = sc.nextInt();
		
		System.out.println("입력한 세 수는 ");
		System.out.println(num1 + " ," + num2 + ", " + num3 );
		
		int sum = num1 + num2 + num3;
		System.out.println("세 수의 합은 " + sum);
		
		double avg = sum / 3.0;
		System.out.println("세 수의 평균은 " + avg);
		
		
		
		
		
		
		
	}

}
