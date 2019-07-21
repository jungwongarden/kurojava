package 클래스기본;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		//add라는 메서드 사용
		//메서드 호출(call)
		cal.add(200, 100);
		cal.minus(200, 100);
		cal.mul(200, 100);
		cal.div(200, 100);
	}

}
