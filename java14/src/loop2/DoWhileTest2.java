package loop2;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		int target = 11;
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.println("나는 일단 실행하고 봐요...!!!!");
			System.out.print("생각한 숫자를 입력>> ");
			input = sc.nextInt();
			
		} while (input != target);
		
		System.out.println("do문이 끝났어요.!!");
		
	}

}
