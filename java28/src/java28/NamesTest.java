package java28;

import java.util.ArrayList;

public class NamesTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("김아무개"); //Object<-String
		list.add(100); //Object<-int
		list.add(0.9); //Object<-double
		
		System.out.println(list);
		
		String name = (String)list.get(0);
		System.out.println(name);
		
		
		
		
		
	}

}
