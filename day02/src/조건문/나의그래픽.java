package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽");
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데 버튼을 눌렀군요.");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uC704\uC5D0 \uC788\uB294 \uBC84\uD2BC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위에 있는 버튼을 눌렀군요.");
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("\uC67C\uCABD \uBC84\uD2BC");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_2.setBackground(Color.ORANGE);
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("\uC624\uB978\uCABD \uBC84\uD2BC");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("\uC544\uB798 \uC788\uB294 \uBC84\uD2BC");
		btnNewButton_4.setBackground(Color.PINK);
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}

}
