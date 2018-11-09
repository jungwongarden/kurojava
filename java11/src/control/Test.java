package control;


public class Test {
	//유니코드의 아스키 범주값은 같다.!
	static char c1 = '\u0000'; //char null인 상태, 아무것도 없는 상태
	static char c2; //기본값 null인 상태
	static char c3 = '\0'; //ascii값
	static char c4 = '0'; //0이라는 "문자"=> 아스키값: 48
	public static void main(String[] args) {
		System.out.println(c1); 
		System.out.println(c1 + 100);
		System.out.println(c2 + 100);
		System.out.println(c3 + 100);
		System.out.println(c4 + 100);
		System.out.println(c4);
	}
}
