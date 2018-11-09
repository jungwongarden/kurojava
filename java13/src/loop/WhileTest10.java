package loop;

import java.util.Scanner;

public class WhileTest10 {
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int num;
		String total = "";
		System.out.println("값들을 입력하세요.");
		
		while ((num = sc.nextInt()) != 0) {
			sum = sum + num;
			total = total + " " + (count+1) + ":" + num + "\n";
			count++;
		}
		double dCount = count;
		
		System.out.println("입력한 값의 합은 " + sum);
		System.out.println("입력한 값의 평균은 " + sum/dCount);
		System.out.println("전체 입력한 값의 갯수는 " + count + "개");
		System.out.println("입력한 값들은------ \n" + total);
		sc.close();
	}
}



