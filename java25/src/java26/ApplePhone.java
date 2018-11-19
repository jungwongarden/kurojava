package java26;

public class ApplePhone implements Phone{

	
	@Override
	public void call() {
		System.out.println("화상전화하다.");
	}
	@Override
	public void text() {
		System.out.println("멀티메일로 문자하다.");
	}

}
