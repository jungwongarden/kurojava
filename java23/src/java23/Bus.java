package java23;

public class Bus extends Car{
	int person;
	
	public void station() {
		System.out.println("정류장에 서다.");
	}

	@Override
	public String toString() {
		return person + ", " + color + " , " + speed; 
	}
	
	
}
