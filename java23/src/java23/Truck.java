package java23;

public class Truck extends Car{
	int load;
	
	public void move() {
		System.out.println("=======");
		
		stop();
		System.out.println("물건을 나르다.");
		start();
		System.out.println("=======");
	}
	
	@Override
	public String toString() {
		return load + ", " + color + " , " + speed; 
	}
}
