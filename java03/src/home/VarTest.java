package home;

public class VarTest {

	public static void main(String[] args) {
		//숫자, 문자
		//숫자=> 정수(소수점x), 실수(소수점o)
		//문자=> 한글자(문자), 여러글자(문자열)
		//저장공간은 변하는 값이 계속 들어갈 수 있음.
		//저장공간 => 변수(Variable)
		int age = 100;	
		double eye = 0.1;
		char gender = '남';	
		String name = "김아무개";
		
		age = 101;
		
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 시력은 " + eye);
		System.out.println("나의 성별은 " + gender);
		System.out.println("나의 이름은 " + name);
		
		
		
		
		
		
		
		
	}

}
