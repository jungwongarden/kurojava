package java17;

public class Test {

	public static void main(String[] args) {
		String input = "A1";
		
		System.out.println("스트링 원래의 값: " + input);
		//----String중 char추출
		char c = input.charAt(0);
		System.out.println(c);
		
		//----String중 char추출--->int로 변환
		char i = input.charAt(1);
		int charToInt = Integer.parseInt(i+""); 
		//▲ 결합 연산자 +로 char를 String으로 변환!
		System.out.println(charToInt+100);

		//----String중 String추출--->int로 변환
		String s = input.substring(1);
		int stringToInt = Integer.parseInt(s);
		System.out.println(stringToInt+100);
	}
}


