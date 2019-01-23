package shop;

import java.util.ArrayList;

public class CollectionTest2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("라면");
		list.add("쫄면");
		list.add("우동");
		
		String food = list.get(0);
		System.out.println(food);
	}

}
