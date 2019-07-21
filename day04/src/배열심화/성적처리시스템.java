package 배열심화;

import java.util.Scanner;

public class 성적처리시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = null;
		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>> ");
			int data = sc.nextInt();
			if (data == 1) {
				System.out.print("학생수: ");
				int data2 = sc.nextInt();
				score = new int[data2];
			}else if (data == 2) {
				//for문 필요-배열의 개수만큼 
				//입력후넣어줌.
				for (int i = 0; i < score.length; i++) {
					System.out.print("점수 입력>> ");
					score[i] = sc.nextInt();
				}
			}else if (data == 3) { 
				//for문 필요-출력만 됨.
				for (int i = 0; i < score.length; i++) {
					System.out.println(score[i]);
				}
			}else if (data == 4) {
				//분석-최대값, 평균
				//for문 필요(최대값)
				int max = score[0];
				for (int i = 0; i < score.length; i++) {
					if(score[i] > max) {
						max = score[i];
					}
				}
				System.out.println("최대값: " + max);
				//for문 필요(평균)
				int sum = 0;
				for (int i = 0; i < score.length; i++) {
					sum = sum + score[i];
				}
				System.out.println("평균: " + sum/score.length);
			}else { //5번일때.
				System.out.println("시스템 종료");
				break;
			}
		}
	}

}
