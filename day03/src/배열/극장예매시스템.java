package 배열;

import java.util.Scanner;

public class 극장예매시스템 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("-------------------");
			System.out.print("예매번호입력(종료-1)>> ");
			int data = sc.nextInt();
			
			if (data == -1) {
				int total = count * 10000;
				System.out.println("예매 시스템 종료");
				System.out.println("당신이 지불할 총 금액은 " + total +"원 입니다.");
				break;
			}
			if(seat[data] == 0) {
				System.out.println("예매가 가능합니다.");
				seat[data] = 1;
				count++;
				System.out.println("예매가 완료되었습니다.");
			}else {
				System.out.println("이미 예매가 된 좌석입니다.");
				System.out.println("다른 좌석을 선택해주세요.");
			}
		}
		
	}

}
