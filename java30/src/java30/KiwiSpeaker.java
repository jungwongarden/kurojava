package java30;

public class KiwiSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("키위 스피커의 사운드 UP");
	}

	@Override
	public void soundDown() {
		System.out.println("키위 스피커의 사운드 DOWN");
	}
	@Override
	public String toString() {
		return "나는 키위";
	}

}
