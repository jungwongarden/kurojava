package java19;

public class Calculator2 {
//2.------------------
//	안녕하세요. 저는 ★자바★프로그래머입니다. 출력하는   메소드 정의 
//	 => 메소드 호출시 언어(예, 자바, 파이썬)를 입력
	public void hi(String lang) {
		System.out.print("안녕하세요. ");
		System.out.println("저는 " + lang + "프로그래머입니다.");
	}
	
//	3. 두 수의 곱을 구하는 메소드 정의
//	   => 메소드 호출시 두 수를 입력.
//	   => main에서 리턴받은 후, 두 수의 곱이 100을 초과하면,
//	      "너무 큰값입니다", 아니면 "아직은 괜찮습니다."
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	
	
	
	
	
	
}



