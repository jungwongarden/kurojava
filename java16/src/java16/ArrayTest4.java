package java16;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] num = {11, 22, 33, 44};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("위치를 찾고 싶은 값을 입력>> ");
		int input = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if(input == num[i]) {
				System.out.println("입력한 값인 " + input + "의 위치는 " + i);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
