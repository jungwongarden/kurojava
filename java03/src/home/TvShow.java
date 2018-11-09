package home;

import java.util.Scanner;

public class TvShow {

	public static void main(String[] args) {
		//기본 출력 장치: 모니터=> Console뷰
		System.out.println("오늘은 월요일입니다.");
		System.out.println("아직은 오전입니다.");
		System.out.print("나의 이름은           ");
		System.out.println("김아무개입니다.");
		//실행은 컨트롤+F11
		//기본 입력 장치: 키보드=> Console뷰
		//System.in
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 날씨를 입력해주세요."); 
		
		String weather = sc.next();

		//3 + 4 = 5
		//= 넣는 것.(대입, 할당)
		
		System.out.print("당신이 입력한 날씨는 ");
		System.out.println(weather);
		
		
		
	}

}
