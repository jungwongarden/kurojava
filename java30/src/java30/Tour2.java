package java30;

public class Tour2 {

	public static void main(String[] args) {
		Speaker s = new BananaSpeaker();
		Window w = new DarkWindow();
		Car car = new Car(s, w);
		
		car.info();
	}

}
