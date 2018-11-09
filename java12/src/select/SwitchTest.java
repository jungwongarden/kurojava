package select;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자를 입력(종료: 0)>> ");
			int num = sc.nextInt();
			if (num >= 0 && num <= 12) {
				switch (num) {
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30일까지 입니다.");
					break;
				case 2:
					System.out.println("28일까지 입니다.");
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("31일까지 입니다.");
					break;
				}// switch end
			} else {
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
	}
}
