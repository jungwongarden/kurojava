package java21;

public class Member {
	String id;
	String pw;
	String level;
	int mil;
	
	//객체생성시 자동 호출되는 특별한 메소드
	//메소드의 이름이 유일하게 대문자로 시작
	//메소드의 이름이 클래스 이름과 동일!
	//입력값이 없는 형태의 메소드는 기본값.(자동생성)
	//자동으로 만들어지는 이 메소드는 기능이 하나도 없다.
	//기능을 넣고 싶으면 내가 코딩해주면 된다.
	//기본 생성자(default constructor)
	public Member() {
		System.out.println("내가 자동 호출된대요....");
		System.out.println("나는 몇 번 호출될까요...");
	}
	
	public Member(String id, String pw, String level, int mil) {
		this.id = id; //this =>해당 클래스
		this.pw = pw;
		this.level = level;
		this.mil = mil;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", level=" + level + ", mil=" + mil + "]";
	}
	
	
}
