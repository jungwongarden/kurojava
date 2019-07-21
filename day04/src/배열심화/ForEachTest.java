package 배열심화;

public class ForEachTest {

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		
		System.out.println("첫번째 num: " + num[0]);
		System.out.println("배열의 개수: " + num.length);
		System.out.println("맨마지막 num: " + num[num.length-1]);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int x : num) {
			System.out.println(x);
		}
		
		String[] names = {"홍길동", "김길동","박길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}
		
		
		
	}

}
