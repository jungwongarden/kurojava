package loop;

public class WhileTest4 {

	public static void main(String[] args) {
		int standard = 1; //시작값
		int sum = 0;
		while(standard<=100) {//조건
			sum = sum + standard;
			standard++;//증감값
		}
		
		System.out.println("총합은 " + sum);
	}
}
