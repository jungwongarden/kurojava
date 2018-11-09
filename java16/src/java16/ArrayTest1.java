package java16;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] num = new int[10];
		//10 = 갯수
		//변수들의 이름은  num
		//변수들을 구분하기 위해 위치값(index)을 사용
		//자바의 위치값: 0 ~ 갯수-1
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 10;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		for (int x : num) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
