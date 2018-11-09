package java18;

public class StringTest {

	public static void main(String[] args) {
		String s = "i am a java programmer.!";
		String s1 = "i am a python programmer.!";
		String s22 = "i am a java programmer.!";
		
		System.out.println(s.toString()); 
		//주소가 가르키는 내용을 출력하게 되어있음.
		
		int[] num = new int[10];
		System.out.println(num.toString());
		//대부분의 기초형은 주소를 출력하게 되어있음.
		
		char[] c2 = new char[10];
		//Character.toString(c2);
		//Wrapping된 클래스의 오버라이드 메소드 toString()을 호출.
		
		System.out.println(c2.toString()); 
		//super.toString()을 호출
		
		char[] c3 = {'a', 'b', 'c'};
		System.out.println(c3);
		System.out.println(c3.toString());
		
		
		//char배열은 char 배열을 string으로 출력하게 되어있음. 
		
		
		System.out.println(s.charAt(0));
		System.out.println(s.substring(7, 11));
		System.out.println(s.substring(12));
		System.out.println(s.indexOf("java"));
		System.out.println("s: " + s.hashCode());
		System.out.println("s22: " + s22.hashCode());
		
		System.out.println(s.concat("I am best!!"));
		System.out.println("s: " + s.hashCode());
		System.out.println("s: " + s);

		String s3 = s.concat("I am best!!");
		System.out.println("s3: " + s3.hashCode());
		System.out.println("s: " + s);
		System.out.println("s3: " + s3);

		System.out.println("전체글자수: " + s.length());
		String[] s2 = s.split(" "); // 공백으로 분리=> 단어별 추출
		System.out.println(s2.length);
		System.out.println(s.getBytes());
		// 네트워크 전송되는 byte배열로 추출.=> 패킷으로 실어 전송할 수 있음.
		System.out.println(s.contains("java"));
		char[] c = { 'g', 'o', 'l', 'd' };
		System.out.println(s.valueOf(c)); // char배열을 String으로!
		System.out.println(s.valueOf(c, 1, 2));// char배열 중 일부만 String으로!
		System.out.println(s.valueOf(true) + "예요!");
		System.out.println(s.valueOf(100) + 100); // int를 String으로!
		System.out.println(s.valueOf('금').length()); // char를 String으로!
		System.out.println(s.valueOf(11.22)); // double을 String으로!
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));
		System.out.println(s1.compareTo(s1));

		System.out.println(s.replace('j', 'h'));
		System.out.println(s);
		String s4 = "i am a java java java programmer.!!";
		System.out.println(s4.replace("java", "jsp"));
		System.out.println("s4: " + s4);
		String s44 = s4.replace("java", "jsp");
		System.out.println("s44: " + s44);
		String s45 = s4.replaceAll("java", "jsp");
		System.out.println("s45: " + s44);

		String s5 = "i am a java java java programmer.!!";
		System.out.println(s5.replaceAll("java", "spring"));

		String s6 = "j j j";
		System.out.println(s6.replace('j', 'h'));
		System.out.println(s6);
		
		//반환값이 있다.(return이 있다.)
		char[] test = s1.toCharArray();
		
		//반환값이 없다.(return이 없다.)
		System.out.println("나는 프린트 되는 애...");
		
		//반환이 있는 메소드
		String result = s1.concat("best");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
