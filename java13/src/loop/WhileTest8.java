package loop;

import java.util.Scanner;

public class WhileTest8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력>> ");
		
		int dan = sc.nextInt();
		int count = 1;
		while (count <= 9) {
			System.out.println(dan + " x " + 
					count + " = " + dan * count);
			count++;			
		}
	}

}
