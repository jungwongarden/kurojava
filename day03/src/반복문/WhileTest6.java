package 반복문;

import java.util.Random;
import java.util.Scanner;

public class WhileTest6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int data2 = r.nextInt(100);
		int target = data2;
		int count = 0;
		
		// 컨트롤+쉬프트+f :코드 정리
		while (true) { // 계속 입력
			count++;
			System.out.print("생각한 숫자입력: ");
			int data = sc.nextInt();
			if (data == target) {
				System.out.println("축하합니다. 정답입니다.");
				System.out.println("당신이 시도한 횟수는: " + count + "회");
				
				break;
			} else {
				if (data > target) {
					System.out.println("너무 큽니다.");
				}else {
					System.out.println("너무 작습니다.");
				}
				System.out.println("안타깝습니다. 정답이 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
