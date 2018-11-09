package select;

import java.util.Date;

public class SwitchTest2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄!!");
			break;
		case 6: case 7: case 8:
			System.out.println("여름!!");
			break;
		case 9: case 10: case 11:
			System.out.println("가을!!");
			break;
		default:
			System.out.println("겨울!!");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
