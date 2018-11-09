package home;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AgeSelect {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
//		콘솔에서 나이를 입력받아서
//		태어난 해를 다이얼로그에 출력하세요.
		System.out.print("나이를 입력>>");
		int age = sc.nextInt();
		int year = 2018 - age + 1;
		JOptionPane.showMessageDialog(null, "당신이 태어난 해는 " + year);

//2. 
//		태어난 해가 2000년 이상이면
//		21세기에 태어나셨군요.
//
//		아니면
//		21세기 전에 태어나셨군요.
		if (year >= 2000) {
			System.out.println("21세기에 태어나셨군요.");
		}else {
			System.out.println("21세기 전에 태어나셨군요.");
		}

		
		
		
		
		
		
		
		
		
	}

}
