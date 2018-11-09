package java06;

public class IpTest {

	public static void main(String[] args) {

		int num = 3;
		try {
			System.out.println(num / 0); // stop
		} catch (Exception e) {
			System.out.println("error !!!");
			System.out.println("calculate error !!!");
		}

		System.out.println("Can I print?? ");
	}

}
