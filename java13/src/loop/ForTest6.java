package loop;


public class ForTest6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("1부터 100까지의 수 중 짝수의 합은 >> " + sum);
	}
	

}
