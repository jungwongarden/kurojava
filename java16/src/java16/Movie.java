package java16;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "   ");
			}

			System.out.println();

			System.out.println("--------------------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "   ");
			}

			System.out.println();

			System.out.print("원하시는 좌석번호를 입력하세요.(종료는 -1)>> ");
			int input = sc.nextInt();
			if(input == -1) break;
			
			System.out.println("당신이 원하는 좌석번호는 : " + input + "번 입니다.");

			if (seat[input - 1] == 1) {
				System.out.println("★이미 예약된 자리입니다.★");
				System.out.println("다른 좌석번호를 선택해야 합니다.");
				System.out.println();
			} else {
				System.out.println("★예약 가능한 자리입니다.★");
				System.out.println("예약을 진행합니다.");
				seat[input - 1] = 1;
				System.out.println("예약 완료 되었습니다.");
				System.out.println();
			}
		}
		System.out.println("예약 시스템을 종료합니다..");
	}
}
