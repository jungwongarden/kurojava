package java23;

import javax.swing.JFrame;

public class MyWindow extends JFrame{

	public MyWindow() {
		setTitle("나의 윈도우 프로그램");
		setSize(500, 500);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow my = new MyWindow();
	}
	
	
}
