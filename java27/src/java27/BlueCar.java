package java27;

public class BlueCar extends Car {
	String food;

	public BlueCar(String color, int velocity, String food) {
		super(color, velocity);
		this.food = food;
	}

	@Override
	public String toString() {
		return "BlueCar [food=" + food + ", color=" + color + ", velocity=" + velocity + "]";
	}
	
	
		
}
