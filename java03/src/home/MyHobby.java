package home;

import java.util.Scanner;

public class MyHobby {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 가장 좋아하는 취미를 입력>> ");
		String hobby = sc.next();//메소드 
		System.out.print("당신이 가장 좋아하는 취미는 " + hobby);
		//+ 결합 연산자
		sc.close();//연결과 관련된 메모리에 잡힌 자원들 제거
		
		
		
		
	}

}




