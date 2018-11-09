package cal;

import java.util.Scanner;

public class Today12 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.println("이번 달 실적을 입력하세요.");
		int target = 100;
		
		int input = sc.nextInt();
		
		int bonus = input >= target? 100: 10;
		
		int result = input + bonus;
		
		System.out.println("당신이 이번달 받은 월급은 " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
