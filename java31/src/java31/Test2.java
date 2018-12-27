package java31;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test2 extends JFrame implements ActionListener{
	JButton b1, b2, b3;
	JPanel p11, p;
	
	public Test2() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		b1 = new JButton("나를 눌러.");
		
		b2 = new JButton("나는 패널에 있는 버튼....");
		
		p11 = new JPanel();
		p11.add(b1);
		
		p = new JPanel();
		p.add(b2);
		
		add(p11);
		add(p);
		
		b1.addActionListener(this);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//b2.setVisible(false);
		b2.setVisible(false);
		b3 = new JButton("나야 마지막");
		p.add(b3);		
	}
}
