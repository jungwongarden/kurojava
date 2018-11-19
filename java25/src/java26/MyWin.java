package java26;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MyWin extends JFrame {
	public MyWin() {
		setTitle("나의 그래픽 프로그램");
		setSize(565, 600);
		JButton b1 = new JButton("나를 눌러보세요..나는 버튼이예요.");
		b1.setIcon(new ImageIcon("D:\\workspaceJAVA\\java\\java04\\007.png"));
		b1.setToolTipText("로그인하세요.");
		b1.setForeground(Color.MAGENTA);
		b1.setBackground(Color.YELLOW);
//		getContentPane().setLayout(new FlowLayout());
		getContentPane().setLayout(null);
		b1.setBounds(84, 66, 341, 100);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("회원가입");
		b2.setBounds(64, 300, 396, 146);
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼도 누르셨군요..!! 환영합니다..!!!");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 18));
		b2.setForeground(Color.BLUE);
		b2.setBackground(Color.ORANGE);
		b2.setToolTipText("회원가입 화면으로 넘어갑니다.");
		getContentPane().add(b2);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 누르셨군요..!!!!");
			}
		});
		
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWin win = new MyWin();
	}
}
