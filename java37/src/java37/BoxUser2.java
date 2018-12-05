package java37;

public class BoxUser2 {

	public static void main(String[] args) {
		Box2<Integer, Integer> b1 = new Box2<Integer, Integer>(10, 10);
		
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println("박스의 넓이는 " + (b1.x * b1.y));
	}

}
