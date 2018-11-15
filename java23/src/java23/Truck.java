package java23;

public class Truck extends Car{
	int load;
	
	public void move() {
		stop();
		System.out.println("물건을 나르다.");
		start();
	}
}
