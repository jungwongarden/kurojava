package select;

import java.util.Scanner;

public class Today3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String food = sc.next();
		String result = null;
		if (food.equals("짬뽕")) {
			result = "짬뽕을 먹으러 가요.";
		} else if (food.equals("자장면")) {
			result = "자장면을 먹으러 가요.";
		} else if (food.equals("우동")) {
			result = "우동을 먹으러 가요.";
		} else {
			result = "안먹어요.";
		}
		System.out.println(result);
	}

}
