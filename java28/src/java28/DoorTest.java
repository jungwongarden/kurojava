package java28;

public class DoorTest {

	public static void main(String[] args) {
		Door d = new Door();
		Apple a = new Apple();
		Banana b = new Banana();
		
		//1.
		Door d2 = a; //업캐스팅
		
		//2.
//		Apple a2 = d;
		Apple a2 = (Apple)d; //다운캐스팅
		
		//3. 
		Door n3 = new Banana();  //업캐스팅
		d.open(); 
		
		//4.
		//Apple a3 = new Banana(); //자식들간 캐스팅 불가능
		
		
		//5. 
		Banana b2 = (Banana)d; //다운캐스팅
	}
}
