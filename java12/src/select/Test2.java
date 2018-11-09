package select;

public class Test2 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = num1; //기초형 복사
		
		System.out.println(num1);
		System.out.println(num2);
		
		String s1 = "hi"; //300
		String s2 = s1; //주소 복사=>300
		System.out.println(s1);
		System.out.println(s2);
		
		
		String s33 = "hi"; //
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s33);
		
		String s3 = new String("hi");//새로운 주소
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("주소 비교: " + (s1 == s2));
		System.out.println("주소 비교: " + (s1 == s3));
		System.out.println("값 비교: " + s1.equals(s3));
	}
}
