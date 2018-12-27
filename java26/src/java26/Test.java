package java26;

public class Test {

	public static void main(String[] args) {
		Other other = new Other();
		int[] result = other.call();
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	
}
