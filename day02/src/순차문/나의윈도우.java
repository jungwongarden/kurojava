package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("\uB098\uB294 \uBC84\uD2BC");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 78));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
