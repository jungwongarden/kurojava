package 반복문;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자입력: ");
			int data = sc.nextInt();
			System.out.println("입력한 값은 " +  data);
		}
	}

}
