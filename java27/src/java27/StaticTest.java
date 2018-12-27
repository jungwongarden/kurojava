package java27;


public class StaticTest {
	
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("몇일간 했는지>> " + Day.count);
		System.out.println("몇일간 했는지>> " + Day.getCount());
		System.out.println("총 몇시간을 했는지>> " + Day.sum);
		System.out.println("총 몇시간을 했는지>> " + Day.getSum());
		System.out.println("평균 시간은>> " + Day.sum/Day.count);
	}

}
