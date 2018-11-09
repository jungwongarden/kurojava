
public class Person {
//	사람 => class(부류)
	
//	- 정적특징: 성별, 이름=> 멤버변수(항목, field)
//=> 전역변수(글로벌 변수, global)
//=> 자동 초기화
	char gender;
	String name;
	
	
//	- 동적특징: 걷는다, 먹는다=> 메소드
	public void walk() {
		System.out.println("걷다.00000");
	}
	public void eat() {
		System.out.println("먹다.");
	}
	
	
}
