package java20;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		CoffeeCalculator cal = new CoffeeCalculator();
		//1.
		Scanner	sc = new Scanner(System.in);
		System.out.println("而ㅽ뵾媛믨낵 �씤�썝�닔瑜� �엯�젰�븯�꽭�슂.");
		int price = sc.nextInt();
		int person = sc.nextInt();
		
		double total = cal.total(price, person);
		
		//2.
		double payment = cal.total(total);
		System.out.println("�떦�떊�씠 理쒖쥌 吏�遺덊븳 湲덉븸�� " + (int)payment + "�썝");
		
		//3.
		String result = cal.total(person);
		System.out.println("�씤�썝�닔 " + person + "紐� 二쇰Ц�� " + 
							result);
		
		//4. 
		System.out.print("癒밴퀬 �떢�� 而ㅽ뵾醫낅쪟瑜� �젙�솗�븯寃� �엯�젰>> ");
		String coffee = sc.next();
		int finalPayment = cal.total(coffee, person);
		System.out.println("而ㅽ뵾 醫낅쪟�뿉 �뵲瑜� 理쒖쥌 吏�遺덊븳 湲덉븸�� " + finalPayment);
	}
}
