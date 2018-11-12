package java20;

public class OverloadingTest {

	public static void main(String[] args) {
		Overload over = new Overload();
		over.add(1, 1); // ok
		//over.add(1, 0.2); //�닚�꽌
		over.add(1.1, 2); // ok
		//over.add(2.3, 4.5); //�뜲�씠�꽣 ���엯
		//over.add(4.4); //媛��닔
	}
}


