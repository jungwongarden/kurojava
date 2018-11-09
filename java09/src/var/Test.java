package var;

public class Test {

	public static void main(String[] args) {
		double data = 123.456;
		System.out.println(Math.round(data));
		int result1 = (int)Math.round(data);
		
		System.out.println(data);
		String result = String.format("%.2f", data);
		System.out.println(result);
	}
}
