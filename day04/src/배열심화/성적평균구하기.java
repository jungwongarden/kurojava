package 배열심화;

import java.util.Scanner;

public class 성적평균구하기 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적입력: ");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		
		
		System.out.println("성적 평균은 " + sum/num.length);
	}

}
