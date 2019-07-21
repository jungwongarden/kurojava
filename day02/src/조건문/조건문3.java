package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값: ");
		int data = sc.nextInt();
		if (data >= 1000) {
			System.out.println("실적달성!");
			double bonus = data * 0.2;
			System.out.println("당신의 보너스는 " + (int)bonus + "만원");
		} else {
			System.out.println("실적미달성!");
		}
	}

}
