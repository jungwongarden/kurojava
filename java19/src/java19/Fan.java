package java19;

public class Fan {
//	선풍기 => 틀(class)

//	- 정적속성(프로퍼티, property): 색, 길이
//	=> 멤버 변수, 항목(field)
	String color;
	int height;

//	- 동적속성: 돌아간다, 높낮이조절하다.
//	=> 메소드
	public void around() { 
		System.out.println("선풍기가 돌아간다.");
	}

	public void control() {
		System.out.println("높낮이가 조절되다.");
	}

	//재정의
	public String toString() {
		String s = "i am string";
		return s;
	}

}
