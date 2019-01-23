package shop;

import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(11.33);
		list.add("ok"); //upCasting(자동형변환)
		
		String ok = (String)list.get(2);//downCastring(강제형변환)
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
