
public class MyRoom {

	public static void main(String[] args) {
		//new => 객체 생성
		//클래스는 타입으로 쓸 수 있다.
		Phone p1 = new Phone();
		
		p1.color = "골드";
		p1.company = "애플";
		
		System.out.println("나의 휴대폰 색은 " + p1.color);
		System.out.println("나의 휴대폰 브랜드는 " + p1.company);
		
		//메소드를 쓰는 것-=> 호출하다.(call)
		p1.call();
		p1.internet();
		
		
		Phone p2 = new Phone();
		p2.color = "초록";
		p2.company = "삼성";
		
		System.out.println("나의 휴대폰 브랜드는 " + p2.company);
		System.out.println("나의 휴대폰 색은 " + p2.color);
		
		p2.call();
		p2.internet();
		
		System.out.println("==========");
		
		//-------사람
		Person w = new Person();
		w.gender = '여';
		w.name = "박아무개";
		
		System.out.println(w);
		w.eat();
		w.walk();
		
		
		
		
		
		
		
		
		
	}

}
