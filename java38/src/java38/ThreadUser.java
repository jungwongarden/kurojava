package java38;

public class ThreadUser {

	public static void main(String[] args) {
		MyTherad my = new MyTherad();
		MyTherad2 my2 = new MyTherad2();
		my.start();
		my2.start();
	}

}
