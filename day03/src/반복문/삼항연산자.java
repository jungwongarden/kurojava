package 반복문;

public class 삼항연산자 {

	public static void main(String[] args) {
		int num = 3;
		System.out.println((num < 5) ? "5보다 작다": "5보다 작지 않다.");
		char result = (num < 5)? 'A':'B';
		System.out.println("최종 결과는 " + result);
	}

}
