package var;

public class VarTest1 {
	int wide;//전체 영역에서 쓸 수 있다.
			   //(전역변수)
	
	public void test() {
		int temp;//선언!(지역변수)
		
	}
	public static void main(String[] args) {
		//자바의 변수는 반드시 변수명 앞에
		//변수에 저장할 데이타의 종류와 크기에 해당하는
		//키워드를 써주어야 함.
		byte age = 100; //= 대입, 할당
		int money = 300000;

		//+ => 연결연산자
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 은행 잔고는 " + money);
		
		float height = 185.5f;
		double pi = 3.14584531; 
		
		char genger = '남'; //한글자=>'
		
		boolean hot = false;//선언+초기화(대입)
		System.out.println("지금 더운가요? " + hot);
		
		double weight;//쓰레기 값=> 선언.
		//선언의 위치=> 사용할 수 있는 범위!!!!
		
		weight = 88.88;//=> 대입
		System.out.println("나의 몸무게는 " + weight);
		
		System.out.println("나의 성별은 " + genger);
		
		
		
		
		
		//""이중 따옴표
		String welcome = "안녕하세요. 반갑습니다.";
		
		
		
		
		
	}

}

