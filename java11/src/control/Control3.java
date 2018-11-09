package control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {

		// 먹고 싶은 음식을 입력하세요.
		// 1. 햄버거, 2. 떡볶이, 3. 피자
		// 1-> 햄버거 1증가, 2-> 떡볶이 2증가
		// 3-> 피자 1증가, 4-> 종료
		Scanner sc = new Scanner(System.in);
		int hamburger = 0, rice = 0, pizza = 0;
		
		while (true) {
			System.out.println("먹고 싶은 음식을 입력하세요. 종료 :4");
			System.out.println("1. 햄버거, 2. 떡볶이, 3. 피자");
			System.out.println("---------------------");
			
			
			int vote = sc.nextInt();
			if (vote == 1) {
				hamburger++;
			}else if(vote == 2) {
				rice++;
			}else if(vote == 3){
				pizza++;
			}else if(vote == 4){
				break;
			}else {
				System.out.println("1부터 4까지의 값만 입력해주세요.");
			}//else
		}//while
		System.out.println("햄버거 " + hamburger);
		System.out.println("떡볶이 " + rice);
		System.out.println("피자 " + pizza);
	}//main

}//class