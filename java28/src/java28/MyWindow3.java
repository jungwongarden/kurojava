package java28;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MyWindow3 extends JFrame {

	public MyWindow3() {
		setTitle("나의 그래픽3");
		setSize(500, 500);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("나를 누르세요.!!");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 또또 눌렀군요...!!!!");
			}
		});
		btnNewButton.setBounds(66, 80, 320, 130);
		getContentPane().add(btnNewButton);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow3 my3 = new MyWindow3();
	}
}
