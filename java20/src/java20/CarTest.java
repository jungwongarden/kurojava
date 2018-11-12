package java20;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		car.color = "鍮④컯";
		car.gear = 2;
		car.speed = 300;
		
		car.speedUp(car);
		car.speedDown();
		
		System.out.println(car);
		
		
	}

}
