package java15;

import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] age = new int[5];
		String[] name = new String[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요.");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("입력>>>> ");
			name[i] = sc.next();
			age[i] = sc.nextInt();
		}
		
		System.out.println("전체 인원수는 " + name.length);
		System.out.println("파티 참석자 전체 명단입니다.");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("이름은: " + name[i] + " , 나이는: " + age[i] );
		}
		
		double sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum = sum + age[i];
		}
		System.out.println("파티 참석자 나이의 평균은 " + sum/age.length + "세");
	}

}


