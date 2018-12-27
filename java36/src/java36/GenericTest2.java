package java36;

public class GenericTest2 {

	public static void main(String[] args) {
		Box2 b1 = new Box2("박아무개");
		String s = (String)b1.name;
		System.out.println(s);

		Box2 b2 = new Box2(100);
		int i = (int)b2.name;
		System.out.println(i);
	}
}
