package java20;

public class CoffeeCalculator {
	public double total(int price, int person) {
		return price * person;
	}
	
	public double total(double totalPrice) {
		if(totalPrice >= 10000) { 
			return totalPrice - 2000;
		}else {
			return totalPrice;
		}
	}
	
	public String total(int person) {
		if(person >= 10) { 
			return "���웾 二쇰Ц�쑝濡� 泥섎━�빀�땲�떎.";
		}else {
			return "湲곕낯 二쇰Ц�쑝濡� 泥섎━�빀�땲�떎.";
		}
	}
	
	public int total(String coffee, int person) {
		if(coffee.equals("�씪�뼹")) { 
			return 4000 * person;
		}else if(coffee.equals("移댄뫖移섎끂")) { 
			return 5000 * person;
		}else if(coffee.equals("諛붾땺�씪�씪�뼹")) { 
			return 3000 * person;
		}else {
			System.out.println("�삱諛붾Ⅸ 而ㅽ뵾 醫낅쪟瑜� 二쇰Ц�빐二쇱꽭�슂.");
			return 0;
		}
	}
}

