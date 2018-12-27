package java27;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	JButton b1;
	
	public MyWindow() {
		setTitle("나의 윈도우");
		setSize(500, 500);
		b1 = new JButton("나를 눌러요...");
		setLayout(new FlowLayout());
		add(b1);
		b1.addActionListener(new ActionProcess());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow my = new MyWindow();
	}

}
