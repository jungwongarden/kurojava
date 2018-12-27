package java28;

public class MomCar implements Speaker {

	public void mom() {
		soundUp();
		soundDown();
	}
	@Override
	public void soundUp() {
		System.out.println("엄마 스피커에서 드라마OS가 만 크게 나와요.");
	}

	@Override
	public void soundDown() {
		System.out.println("엄마 스피커에서 드라마OST가 작게 나와요.");

	}

}
