package java38;

public class MyTherad2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("#");
		}
	}
}
