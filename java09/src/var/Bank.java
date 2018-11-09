/*
 * 은행이 있습니다.
좋은 은행은 대출이자율이 0.2이예요.
나쁜 은행은 대출이자율이 0.5이예요.

예금주는 김길동.
전화번호는 010-1234-5678.
계좌에 들어있는 금액은 1000000원.
김길동씨가 좋은 은행에서 대출받고 싶은 금액은
10000000원.
대출받았습니다. 은행계좌에 넣음.
김길동씨의 현재 계좌에 잔고는?
김길동씨의 연락처는?
 */
package var;

public class Bank {

	public static void main(String[] args) {
		final double GOOD = 0.2;
		final double BAD = 0.5;
		
		String name = "김길동";
		String tel = "010-1234-5678";
		int money = 1000000;//현재 은행 잔고
		
		int amount = 10000000;//대출받을 금액
		double loan = amount * GOOD;
		System.out.println(loan);
		
		double total = money + loan;
		
		System.out.println("현재 은행 잔고는 " + (int)total + "원");
		
	}

}
