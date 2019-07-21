package 조건문;

import javax.swing.JFrame;
import javax.security.auth.Subject;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기그래픽 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setTitle("나의 그래픽");
		f.setSize(500, 500);
		
		JButton top = new JButton("\uC704\uC5D0 \uBC84\uD2BC");
		JButton sub = new JButton("\uC544\uB798 \uBC84\uD2BC");
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top을 누르셨군요.");
				f.setTitle("top을 누르셨군요.");
				sub.setText("top을 누르셨군요.");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JButton middle = new JButton("\uAC00\uC6B4\uB370 \uBC84\uD2BC");
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
