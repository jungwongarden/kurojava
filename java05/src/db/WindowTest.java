package db;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowTest implements ActionListener {
	static JButton b1 = new JButton("1번 버튼");
	static JButton b2 = new JButton("2번 버튼");
	
	int age; //선언!
	//클래스 바로 아래에 변수를 선언하면
	//자동으로  clear!(초기화)
	//age = 0
	
	//메소드내에서 변수를 선언하면
	//변수내에는 쓰레기값
	
	
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JTextArea area = new JTextArea(10, 20);
		area.setBackground(Color.red);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(area);
		JTextField t = new JTextField(20);
		t.setText("Search");
		t.setToolTipText("hi............");

		t.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (t.getText().equals("Search")) {
					t.setText("");
					t.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (t.getText().isEmpty()) {
					t.setForeground(Color.GRAY);
					t.setText("Search");
				}
			}
		});

		f.add(t);
		f.add(b1);
		f.add(b2);

		WindowTest w = new WindowTest();
		b1.addActionListener(w);
		b2.addActionListener(w);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("b1을 누르셨군요...");
		}
		if (e.getSource() == b1) {
			System.out.println("b2를 누르셨군요...");
		}
	}

}
