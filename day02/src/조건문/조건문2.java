package Á¶°Ç¹®;

import java.util.Date;

public class Á¶°Ç¹®2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();//ÇöÀç½Ã°¢
		if(hour < 11) {
			System.out.println("±Â¸ð´×");
		}else if(hour < 15) {
			System.out.println("±Â¾ÖÇÁÅÍ ´«");
		}else if (hour < 20) {
			System.out.println("±ÂÀÌºê´×");
		}else {
			System.out.println("±Â³ªÀÕ");
		}
	}

}
