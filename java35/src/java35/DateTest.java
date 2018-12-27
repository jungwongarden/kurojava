package java35;

import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DATE, 1); //하루 증가!
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		cal.set(year, month, date);
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.YEAR) +""+ cal.get(Calendar.MONTH) +"" + cal.get(Calendar.DATE));
	}
}


