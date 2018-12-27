package java30;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet  bag = new HashSet();
		bag.add("휴대폰");
		bag.add("볼펜");
		bag.add(10000);
		bag.add("볼펜");
		
		System.out.println(bag);
		System.out.println(bag.size());
	}

}
