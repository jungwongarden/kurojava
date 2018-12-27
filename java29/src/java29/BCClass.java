package java29;

public class BCClass implements B, C {

	@Override
	public void c() {
		System.out.println("C인터페이스를 구현한 클래스");
	}

	@Override
	public void b() {
		System.out.println("B인터페이스를 구현한 클래스");

	}

}
