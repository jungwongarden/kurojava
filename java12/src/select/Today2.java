package select;

import java.util.Date;

public class Today2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth()+1;
		System.out.println("this month is: " + month);
		String result = null; 
		//주소값이 들어가는 변수의 초기화는 아무것도 없는 상태를 
		//의미하는 null
		if (month >= 3 && month <= 5) {
			result = "봄";
		} else if (month >= 6 && month <= 8) {
			result = "여름";
		} else if (month >= 9 && month <= 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		
		
		System.out.println("이번 달에 해당하는 계절은 " + result);
		
		
		
		
		
		
		
		
	}

}
