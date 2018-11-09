package home;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();//틀
		f.setSize(800, 500);
		f.setTitle("나의 첫 그래픽 프로그램");
		
		JButton button = new JButton("나를 누르세요..................");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		String input = JOptionPane.showInputDialog("버튼에 올라갈 글자를 입력");
		
		button.setText(input);
		
		button.setBackground(Color.yellow);
		button.setForeground(Color.BLUE);
		
		f.add(button);
		f.setVisible(true);
	}
}
