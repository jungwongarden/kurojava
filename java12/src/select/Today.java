package select;

import java.util.Date;
import java.util.Scanner;

public class Today {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		if(hour < 11) {
			System.out.println("굿모닝");
		}else if(hour < 16) {
			System.out.println("굿에프터 눈");		
		}else if(hour < 20) {
			System.out.println("굿 이브닝");
		}else {
			System.out.println("굿 나잇");
		}
		
		String s = "A";
		char c = 'A';
		int num = 65;
		System.out.println((char)num);
		
		
		
		
		
		
		
		
		
	}

}
