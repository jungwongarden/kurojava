package java15;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "hello";
		s[1] = "java";
				
		System.out.println(s.hashCode());
		System.out.println(s[0].hashCode());
		System.out.println(s[1].hashCode());
		
	}

}
