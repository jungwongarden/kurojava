package loop;

import java.util.Scanner;

public class WhilteTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("나는 돌아..");
			System.out.print("입력(종료 1) >>  ");
			int count = sc.nextInt();
			if(count == 1) {
				System.out.println("나는 while무한 루프가 끝나요.");
				break;
			}
			
			//while로 무한루프를 돌리는 경우
			//jvm은 이것을 무한루프라고 인식하여
			//while이후의 문장이 있으면 안된다고 생각하여
			//unreachable code로 판단.!
			//while이후의 코드를 넣을 수 없는 문제가 발생한다.
			//해결책은 while 코드 내 윗부분에 if문으로 이 while문이
			//특정한 조건이 참인 경우  이 while루프가 끝날 수 있음을
			//명시하면 해결!

			switch (count) {
			case 2:
				System.out.println("나는 2야.");
				break;
			case 3:
				System.out.println("나는 3이야.");
				break;
			
			default:
				System.out.println("나는 엉뚱한 값이야..");
				break;
			}
			System.out.println("---------");
			System.out.println("나는 아직 while 안이야...");
			System.out.println();
		}
		System.out.println("나는 while 밖이야."); //!!!!!!!
	}

}
