package java21;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest2 {

	public SwingTest2() {
		JFrame f = new JFrame();
		JButton[]	buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i+"");
		}
	}
	public static void main(String[] args) {
		SwingTest2 swing = new SwingTest2();
	}

}
