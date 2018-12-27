package java30;

import java.util.ArrayList;
import java.util.Iterator;

public class SkiTest {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		ski.remove(1);
		System.out.println(ski);

		for (int i = 0; i < ski.size(); i++) {
			System.out.println(ski.get(i));
		}
		for (Object o : ski) {
			System.out.println(o);
		}
	}
}
