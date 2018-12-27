package java36;

public class GenericTest {

	public static void main(String[] args) {

		Box<String> box1 = new Box<String>("park");
		System.out.println(box1.name);

		Box<Integer> box2 = new Box<Integer>(100);
		System.out.println(box2.name);
	}
}
