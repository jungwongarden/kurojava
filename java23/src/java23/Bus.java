package java23;

public class Bus extends Car{
	int person;
	
	public void station() {
		System.out.println("터미털에 서다.");
	}

	@Override
	public String toString() {
		return "Bus [person=" + person + "]";
	}
	
	
}
