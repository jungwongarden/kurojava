package java29;

public class SonySpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("소니스피커로 사운드 UP...");
	}

	@Override
	public void soundDown() {
		System.out.println("소니스피커로 사운드 DOWN...");
	}

}
