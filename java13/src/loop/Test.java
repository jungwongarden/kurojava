package loop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		char c = 'c';
		int b = c - 1;
		int d = c + 1;
		
		
//		System.out.println((char)b);
//		System.out.println((char)d);
		
		Scanner sc = new Scanner(System.in);
		
		while ((c = sc.next().charAt(0)) != 'x') {
			System.out.println(c);
		}
		
	}

}
