package bean2;

public class ComputerUser {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.color = "검정색";
		com.size = 21;
		
		com.internet();
		com.music();
		System.out.println(com.color);
		System.out.println(com.size);
	}

}
