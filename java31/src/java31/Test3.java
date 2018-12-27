package java31;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;

		System.out.println("자동차 성능 테스트입니다.");
		System.out.println("--------------------");
		System.out.print("자동차의 연비를 입력해주세요>>");
		int fuel = sc.nextInt();
		System.out.print("자동차의 속도를 입력해주세요>>");
		int speed = sc.nextInt();
		System.out.print("자동차의 안정성을 입력해주세요>>");
		int balance = sc.nextInt();

		if (fuel >= 20 && speed >= 250 && balance >= 100) {
			total = total + 50;
			total = total + 50;
			total = total + 50;
		} else if (fuel >= 20 && speed >= 200 && balance >= 100) {
			total = total + 30;
			total += total + 30;
			total += total + 30;
		} else {
			total = total + 15;
			total += total + 15;
			total += total + 15;
		}

		int sum = fuel + speed + balance;

		if (sum >= 100) {
			System.out.println("우수");
		} else if (sum >= 100 && sum >= 80) {
			System.out.println("보통");
		} else {
			System.out.println("불량");
		}

	}
}