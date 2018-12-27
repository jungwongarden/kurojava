package java27;

public class Car {
	String color;
	int velocity;
	
//	public Car() {
//	}
	
	public Car(String color, int velocity) {
		super();//모든 클래스는 부모클래스의 기본생성자를 호출하게 되어있음.
		//기본값, 지워줘도 됨.
		//묵시적, 안써줘도 됨.
		this.color = color;
		this.velocity = velocity;
	}
	
	
	
	
}
