package loop;

import java.util.Random;
import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		int totalCount = 0, same = 0;
		int s = 0, r = 1, p = 2;
		int meSWin = 0, meRWin = 0, mePWin = 0;
		int computerWin = 0;

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		while (true) {
			System.out.print("가위0, 바위1, 보2 중 하나를 입력해주세요.[종료는 4]>> ");
			int me = sc.nextInt();

			if (me == 4) {
				System.out.println("게임을 종료합니다.===");
				break;
			}

			totalCount++;
			int computer = random.nextInt(3);
			if (me == 0) {// 가위
				if (computer == 0) {// 가위
					System.out.println("비겼음.");
					same++;
				} else if (computer == 1) {// 바위
					System.out.println("컴퓨터 승.");
					computerWin++;

				} else {// 보
					System.out.println("내가 승.");
					meSWin++;
				}
			} else if (me == 1) {// 바위
				if (computer == 0) {// 가위
					System.out.println("내가 승.");
					meRWin++;
				} else if (computer == 1) {// 바위
					System.out.println("비겼음.");
					same++;
				} else {// 보
					System.out.println("컴퓨터 승.");
					computerWin++;
				}
			} else {// 보
				if (computer == 0) {// 가위
					System.out.println("컴퓨터 승.");
					computerWin++;
				} else if (computer == 1) {// 바위
					System.out.println("내가 승.");
					mePWin++;
				} else {// 보
					System.out.println("비겼음.");
					same++;
				}
			}
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("★★★★★★★★★★★★ Game Start★★★★★★★★★★★★★★");
			System.out.println("게임 전체 횟수 " + totalCount + "회");
			System.out.println("컴퓨터 전체 승리 횟수 " + computerWin + "회");
			System.out.println("나의 가위로 이깃 횟수 " + meSWin + "회");
			System.out.println("나의 바위로 이깃 횟수 " + meRWin + "회");
			System.out.println("나의 보로 이깃 횟수 " + mePWin + "회");
			System.out.println("게임 전체 비긴 횟수 " + same + "회");
			System.out.println();
		}

	}

}
