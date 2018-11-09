package java16;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] num = {100, 200, 300, 400, 500};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		for (int x : num) {
			System.out.println(x);
		}
		
		System.out.println();
		
		String[] names = {"박아무개", "송아무개", "김아무개", "정아무개", "장아무개"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}
		
		char[] gender = {'남', '여', '남', '남', '여'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		
		for (char c : gender) {
			System.out.println(c);
		}
		
		double[] eyes = {0.2, 0.5, 0.9, 2.0, 1.5};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
	}

}
