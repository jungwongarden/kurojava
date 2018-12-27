package java29;

public class RedCar2 extends Car2 {
	public void sell() {
		System.out.println("커피를 팔다.");
	}
	
	@Override
	public void speedUp() {
		System.out.println("커피를 팔때는 조금 속도를 Up..");
	}
}
