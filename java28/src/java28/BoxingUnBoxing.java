package java28;

import java.util.ArrayList;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		int i = 100;
		
		Integer i2 = 100; //boxing
		
		int i3 = i2; //unboxing
		
		
		System.out.println(i3);
		
		ArrayList list = new ArrayList();
		
		list.add(100); 
		//int-(boxing)->Integer-(upCastring)->Object
		
		int i4 = (Integer)list.get(0);
		//Object-(downCasting)->Integer(랩퍼,포장클래스)-(unBoxing)->int
		
		System.out.println(i4);
	}

}
