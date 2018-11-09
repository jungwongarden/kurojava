package java19;

public class ClockUser {

	public static void main(String[] args) {
		MyClock clock = new MyClock();
		clock.color = "빨강";
		clock.time = 11;
		
		System.out.println("내 시계 색은 " + clock.getColor());
		System.out.println("지금 현재 시각은 " + clock.getTime());
		
	}

}
