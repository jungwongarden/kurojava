package loop;

public class WhileTest5 {

	public static void main(String[] args) {
		int standard = 1; //시작값
		int mul = 1;
		while(standard<=10) {//조건
			mul = mul * standard;
			standard++;//증감값
		}
		
		System.out.println("곱한 값은 " + mul);
		
		
		
		
	}

}
