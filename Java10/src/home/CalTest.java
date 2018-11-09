package home;

import javax.swing.JButton;

public class CalTest {
	static int num5; //선언
	//static int num6 = num4;
	
	JButton b1 = new JButton("나를 누르세요.");
	JButton b2;
	
	public static void main(String[] args) {
		int num = 100; 	
		double num2 = 55.66;  
		char c1 = 'A';
		boolean b1 = true;
		
		int num3 = 20; //-21억 ~ 21억
		//자바의 변수를 쓸 때는 변수명 앞에다가
		//저장될 데이타의 타입을 꼭~~~써주어야 한다.
		
		String name = "자바";
		
		int num4; 
		//깨끗하지 않은 상태(쓰레기 값)의 값이 저장!
		//선언!=> 선언의 위치가 사용할 수 있는 범위!!!
		
		//1.에러
		//System.out.println(num4);
		
		num4 = 200;
		
		//2.
		System.out.println(num4);
		
		num5 = num4;
		
		System.out.println(num4);
		System.out.println(num5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
