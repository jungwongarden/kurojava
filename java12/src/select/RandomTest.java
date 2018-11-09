package select;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random(100);
		for (int i = 0; i < 100; i++) {
			int num = random.nextInt(100);
			System.out.println(num);
		}
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextLong());
	}

}
