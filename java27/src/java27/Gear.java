package java27;

public class Gear implements Clock {

	@Override
	public void watchTime() {
		System.out.println("시각을 보다.");
	}

	@Override
	public void stopWatch() {
		System.out.println("운동한 시간을 보다.");
	}

}
