package java20;

public class Car {
	int speed;
	int gear;
	String color;
	
	
	public void speedUp(Car car) {
		System.out.println("�엯�젰�맂 �깋�� " + car.color);
		System.out.println("�냽�룄瑜� Up");
	}
	
	public void speedDown() {
		System.out.println("�냽�룄瑜� Down");
	}

	// kgjava@daum.net => at(~�뿉) 
	// annotation(�몴湲�,�몴�떆) 
	
	@Override //�삤踰꾨씪�씠�뱶: �옱�젙�쓽=>@
	public String toString() {
		return "Car [speed=" + speed + ", gear=" + gear + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
}
