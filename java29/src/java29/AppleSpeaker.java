package java29;

public class AppleSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("애플스피커로 사운드 UP...");
	}

	@Override
	public void soundDown() {
		System.out.println("애플스피커로 사운드 DOWN...");
	}

}
