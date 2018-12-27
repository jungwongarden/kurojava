package java29;

public class BlueCar2 extends Car2 {

	public void tour() {
		System.out.println("자동차로 전국 투어를 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("경치를 보기위해 한동안 STOP..");
	}

}
