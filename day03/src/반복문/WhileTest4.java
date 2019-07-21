package 반복문;


public class WhileTest4 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while (i <= 1000) {
			sum = sum + i;
			i++; 
		}
		System.out.println("총합은 " + sum);
	}
}
