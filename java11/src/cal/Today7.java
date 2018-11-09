package cal;

import java.util.Scanner;

public class Today7 {

	public static void main(String[] args) {
//		정수입력: 수학 중간고사 점수가 80점 이상이고,
//		스트링입력: 수학 수행평가 점수가 B등급이면 
//		=> pass
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 점수 입력>> ");
		int mid = sc.nextInt();
		System.out.print("수학 수행 점수 입력");
		String doing = sc.next();
		char c = doing.charAt(0);
		
		String result;
		
		if (mid >= 80 && c == 'B') {
			result = "PASS";
		} else {
			result = "NO PASS";
		}
		System.out.println("최종 결과는 " + result);
		
		
		
		
		
		
	}

}
