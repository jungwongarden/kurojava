package java200;

public class Clock {
//	시계
//	- 정적속성(필드, 항목, 멤버변수)=> 전역변수
//	  색, 모양
	String color;
	String shape;
	
//	- 동적속성(메소드)
//	  run(현재까지 작동된 시간), 
//	  stop(어디에 있을때 멈추었는지 장소)
	public void run(int time) {
		System.out.println("현재까지 작동된 시간은 " + time);
	}
	
	public void stop(String location) {
		System.out.println("시계가 " + location + "에서 멈추었습니다.");
		
	}

	@Override
	public String toString() {
		return "Clock [color=" + color + ", shape=" + shape + "]";
	}
	
	
	
	
	
	
	
}
