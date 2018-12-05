package java37;

public class BoxUser {

	public static void main(String[] args) {
		Box<Integer, Integer> b1 = new Box<>(100, 200);
		Box<String, Integer> b2 = new Box<>("네모상자", 200);
		Box<String, String> b3 = new Box<>("네모상자", "빨간색");
		
		Student s = new Student("박아무개", 20, "019");
				
		Box<Student, Integer> b4 = new Box<>(s, 200);
		System.out.println(b4);
		
	}
}
