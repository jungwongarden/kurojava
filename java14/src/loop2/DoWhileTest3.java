package loop2;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.print("올바른 월을 입력 [1-12] >> ");
			input = sc.nextInt();
			
		} while (input < 1 || input > 12);
		
		System.out.println("드디어 올바른 월을 입력하셨군요.!! 입력월: " + input);
		
	}

}
