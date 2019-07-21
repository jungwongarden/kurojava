package 조건문;

import java.util.Date;

public class 조건문1 {

	public static void main(String[] args) {
		
		//자동 import
		//컨트롤+쉬프트+o(영문)
		Date date = new Date();
		int hour = date.getHours();//현재시각
		
		if (hour <= 12) {
			System.out.println("오전");
		} else {
			System.out.println("오후");

		}
	}

}
