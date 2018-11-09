package var;

public class PrintTest {

	public static void main(String[] args) {
	
		int num = 12345;
		System.out.printf("I am decimal..%10d!!!!\n", num);
		System.out.println();
		
		int num2 = 123;
		//전체숫자가 차지할 글자수는 8글자.
		System.out.printf("total 8chars: 8char %8d~~\n", num2);
		
		double d = 12345.78888;
		System.out.printf("i am float...%10.2f @@@@", d);
		System.out.println();
		
		String name = "love Spring!";
		String name2 = "love Spring2!";
		
		String name3 = "i am java";
		System.out.printf("Also I wish \" %s \" %5d", name3, num2);
		
		
		
	}

}
