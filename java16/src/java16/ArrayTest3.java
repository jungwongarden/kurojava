package java16;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		String[] subject = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < subject.length; i++) {
			System.out.print("과목입력>> ");
			subject[i] = sc.next();			
		}
		
		System.out.println("** " + subject[0] + "보다는 " + 
							subject[1] + " **");
		
		
		
		
		
		
		
		
		
		
	}

}
