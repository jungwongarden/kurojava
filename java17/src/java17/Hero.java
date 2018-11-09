package java17;

import javax.swing.JOptionPane;

public class Hero {
	public static void main(String[] args) {
		int ironMan = 0, superMan = 0, batMan = 0;

		String[] hero = new String[6];

		// ====== 배열에 입력 하는 부분 ================================== //
		for (int i = 0; i < hero.length; i++) {

			String input = JOptionPane.showInputDialog("영웅 이름을 입력해주세요.");

			if (input.equals("종료"))
				break;

			hero[i] = input;

			if (hero[i].equals("아이언맨")) {
				if (ironMan > 0) {
					System.out.println("아이언맨이 이미 존재합니다.");
					System.out.println("아이언맨을 추가합니다.");
				}
				ironMan++;
			}
			if (hero[i].equals("슈퍼맨")) {
				if (superMan > 0) {
					System.out.println("슈퍼맨이 이미 존재합니다.");
					System.out.println("슈퍼맨을 추가합니다.");
				}
				superMan++;
			}
			if (hero[i].equals("배트맨")) {
				if (batMan > 0) {
					System.out.println("배트맨이 이미 존재합니다.");
					System.out.println("배트맨을 추가합니다.");
				}
				batMan++;
			}

		}

//====== 배열을 프린트 하는 부분  ================================== //
		if (hero[0] != null) {

			System.out.println("전체 입력한 영웅 리스트입니다. ");
			System.out.println("==========================");
			for (String s : hero) {
				System.out.print(s + " ");
			}

			System.out.println("");
			System.out.println();

			System.out.println("아이언맨은 전체 " + ironMan + "명입니다.");
			if (ironMan > 0) {
				System.out.println("철의 인간이군요!");
			}
			System.out.println();

			System.out.println("슈퍼맨은 전체 " + superMan + "명입니다.");
			if (superMan > 0) {
				System.out.println("하늘을 나는군요!");
			}
			System.out.println();

			System.out.println("배트맨은 전체 " + batMan + "명입니다.");
			if (batMan > 0) {
				System.out.println("박쥐인간이군요!");
			}
			System.out.println();
		} else {
			System.out.println("종료를 선택하셨습니다.");
			System.out.println("영웅 입력  시스템을 종료합니다.");
		}
	}
}
