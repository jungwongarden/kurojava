package java27;

public class RandomTest {

	public static void main(String[] args) {
		double d = Math.random();
		System.out.println("발생되는 값: " + d);
		System.out.println("최소값을 정해봅시다: " + (Math.random() + 1));
		System.out.println("**반올림**: " + Math.round(Math.random()));
		double sosu = Math.random();
		System.out.println(sosu);
		System.out.printf("**소숫점 자르기**: %.2f", sosu);
		System.out.println();
		System.out.println("정수 최소값으로 변경해봅시다: " + (int)(Math.random() + 1));
		System.out.println("최대값을 정해봅시다: " + Math.random() * 3);
		System.out.println("정수 최대값으로 변경해봅시다: " + (int)(Math.random() * 3));
		System.out.println("최대값과 최소값을 정해봅시다: " + Math.random() * 3 + 1);
		System.out.println("정수 최소값, 최대값으로 변경해봅시다: " + (int)(Math.random() * 3 + 1));
		
	}
}
