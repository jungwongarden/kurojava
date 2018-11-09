package cal;

import java.util.Scanner;

public class Today2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("여러가지 타입 데이터입력하세요...");
		System.out.println("스트링, 정수, 실수, 한줄 순서대로..");
		String s = sc.next(); //스트링(단어) 입력
		int i = sc.nextInt(); //스트링->int
		double d = sc.nextDouble(); //double
		sc.nextLine();
		String line = sc.nextLine(); //한줄 입력
		
		System.out.println("문자: " + s);
		System.out.println("정수: " + i);
		System.out.println("실수: " + d);
		System.out.println("라인: " + line);
		
		
		
		
		
		
		
		
	}

}
