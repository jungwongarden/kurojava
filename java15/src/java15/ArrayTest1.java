package java15;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] s = new int[10];
					     //=> 갯수!
		int s2[] = new int[20];
		
		//int가 들어가는 배열!
		//각 타입에 따라서 다 만들 수 있다.
		
		s[0] = 100;
		s[5] = 200;
		s[9] = 900;
		System.out.println(s[0]);
		System.out.println("배열의 갯수는 " + s.length);
		System.out.println("배열의 변수에 들어있는 것 " + s);
		System.out.println("첫 번째 값 " + s[0]);		
		System.out.println("여섯 번째 값 " + s[5]);		
		System.out.println("마지막 값 " + s[9]);
		System.out.println("두 번째 값 " + s[1]);
	}
}
