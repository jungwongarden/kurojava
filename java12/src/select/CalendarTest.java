package select;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("이번주 중 " + today.get(Calendar.DAY_OF_WEEK)+"번째 날입니다.");
		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek == 1) {
			System.out.println("일요일 입니다.");
		}else if(dayOfWeek == 2) {
			System.out.println("월요일 입니다.");
		}else if(dayOfWeek == 3) {
			System.out.println("화요일 입니다.");
		}else if(dayOfWeek == 4) {
			System.out.println("수요일 입니다.");
		}else if(dayOfWeek == 5) {
			System.out.println("목요일 입니다.");
		}else if(dayOfWeek == 6) {
			System.out.println("금요일 입니다.");
		}else {
			System.out.println("토요일입니다.");
		}
	}
}



