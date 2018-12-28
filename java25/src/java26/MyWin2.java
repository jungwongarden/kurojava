package java26;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWin2 extends JFrame {

	public MyWin2() {
		setTitle("나의 2번째 윈도우 프로그램");
		setSize(500, 300);
		JButton b1 = new JButton("나는 위로 갈 버튼");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위로 갈 버튼을 누르셨군요.");
			}
		});
		b1.setBackground(Color.YELLOW);
		JButton b2 = new JButton("나는 왼쪽으로 갈 버튼");
		b2.setBackground(Color.GREEN);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("왼쪽으로 갈 버튼을 누르셨군요.");
			}
		});
		JButton b3 = new JButton("나는 가운데로 갈 버튼");
		b3.setBackground(Color.RED);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데로 갈 버튼을 누르셨군요.");
			}
		});
		JButton b4 = new JButton("나는 오른쪽으로 갈 버튼");
		b4.setBackground(Color.CYAN);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("오른쪽으로 갈 버튼을 누르셨군요.");
				
			}
		});
		JButton b5 = new JButton("나는 아래로 갈 버튼");
		b5.setBackground(Color.PINK);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("아래로 갈 버튼을 누르셨군요.");
			}
		});
		
		getContentPane().add(b1, BorderLayout.NORTH);
		getContentPane().add(b2, BorderLayout.WEST);
		getContentPane().add(b3, BorderLayout.CENTER);
		getContentPane().add(b4, BorderLayout.EAST);
		getContentPane().add(b5, BorderLayout.SOUTH);
		
		
		
		
		
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWin2 win2 = new MyWin2();
	}

}
