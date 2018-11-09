package loop;

import java.util.Random;

public class WhileTest9 {
	
	public static void main(String[] args) {
		Random random = new Random();
		int count = 0;
		int sum = 0;
		String total = "";
		while (count < 10) {
			int num = random.nextInt(100);
			sum = sum + num;
			total = total + " " + (count+1) + ":" + num + "\n";
			count++;
		}
		
		System.out.println("랜덤한 값의 합은 " + sum);
		System.out.println("랜덤한 값들은------ \n" + total);
		
		
	}
}


