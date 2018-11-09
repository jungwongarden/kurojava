package java19;

public class FlowerUser {

	public static void main(String[] args) {
		Flower flower = new Flower();
		flower.id = "root";
		flower.name = "박아무개";
		flower.price = 1000;
		
		flower.getInfo1();
		
		System.out.println(flower.getInfo2());
		
			
	}

}
