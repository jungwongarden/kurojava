package jsp17;

public class Test {
	public static void main(String[] args) {
		String[] names = {"감자", "고구마", "양파"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String s : names) {
			System.out.println(s);
		}
		
	}
}
