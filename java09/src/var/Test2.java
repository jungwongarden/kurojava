package var;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Test2 extends JFrame{

	public Test2() {
		JPanel	p = new JPanel();
		setSize(300, 300);
		
		JScrollPane scroll = new JScrollPane(p);
		
		JTextArea area = new JTextArea(15, 20);
		p.setBounds(0, 0, 300, 300);
		scroll.setBounds(0, 0, 300, 300);
		p.setBackground(Color.yellow);
		
		add(scroll);
		p.add(area);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
	}
}
