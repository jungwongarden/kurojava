package java19;

public class CalUser {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.use(); // void타입의 메소드는 호출하고 끝!

		System.out.println(cal.add(22.11, 33.44));
		double result = cal.add(100, 55.55);
		System.out.println(result - 50);
		int result2 = cal.add(100, 200);
		System.out.println(result2);
		String result3 = cal.add("i", "will");
		System.out.println(result3);	

	}

}
