package java30;

public class Tour {

	public static void main(String[] args) {
		AppleSpeaker a = new AppleSpeaker();
		//Car car = new Car(a);

		BananaSpeaker b = new BananaSpeaker();
		Car car = new Car(b);
		
		Car car2 = new Car(new KiwiSpeaker());
		
		
		
		
	}

}
