package loop;

public class ForTest {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지 더한 값은 " +sum);
	}

}
