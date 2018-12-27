package java28;

public class IPhoneA implements IPhoneJack{

	@Override
	public void even() {
		System.out.println("쇠로 납작하게 만들다.");
	}

	@Override
	public void round() {
		System.out.println("노랑색으로 둥그렇게 만들다.");
	}

}
