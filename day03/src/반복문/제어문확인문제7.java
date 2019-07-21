package 반복문;

import java.util.Scanner;

public class 제어문확인문제7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.예금|2.출금|3.잔금|4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>> ");
			int data = sc.nextInt();
			if(data == 1) {
				System.out.print("예금액입력>> ");
				int data2 = sc.nextInt();//예금액 입력
				money = money + data2;
			}else if (data == 2) {
				System.out.print("출금액입력>> ");
				int data3 = sc.nextInt();//예금액 입력
				money = money - data3;
			}else if (data == 3) {
				System.out.println("현재 잔금: "  + money + "원");
			}else {
				System.out.println("시스템 종료합니다.");
				break;
				//종료
			}
		}
	}

}
