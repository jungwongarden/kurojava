package java21;

public class ClockUser {

	public static void main(String[] args) {
		Clock c = new Clock();
		Clock c1 = new Clock(1000, "apple");
		Clock c2 = new Clock(2000, 10, "banana");
		Clock c3 = new Clock(3000, "fly", 11, "straw");
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
