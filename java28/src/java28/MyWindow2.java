package java28;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame implements ActionListener {
	JButton b;

	public MyWindow2() {
		setTitle("나의 그래픽");
		setSize(300, 300);
		b = new JButton("나를 눌러요.................");
		setLayout(new FlowLayout());
		add(b);
		b.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("저를 또 누르셨군요....!!!!");
		if(e.getSource() == b ) {
			System.out.println("저는 버튼이예요!!!..");
		}
	}
	
	public static void main(String[] args) {
		MyWindow2 my = new MyWindow2();
	}
}
