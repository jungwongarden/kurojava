package var;

import java.util.Scanner;

public class TodayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.print("오늘의 기온은 ? ");
		int temper = sc.nextInt();//기온 입력
		System.out.print("나의 평가는 ? ");
		String level = sc.next();
		char cLevel = level.charAt(0);//문자 추출
//		ABCDE
//		01234
//
//		위치값(index, 0부터 시작)
		System.out.print("나의 신발 사이즈는 ? ");
		double shoes = sc.nextDouble();
		
		System.out.println("------------------");
		
		System.out.printf("오늘은 %3d도, 나의 평가는 %c, 신발은 %5.1f", temper, cLevel, shoes);
		
		
		
		
	}

}
