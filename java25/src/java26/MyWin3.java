package java26;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MyWin3 extends JFrame {

	public MyWin3() {
		setTitle("나의 윈도우 프로그램3");
		setSize(557, 593);
		getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("로그인 화면으로 넘어갑니다.");
		btnNewButton.setIcon(new ImageIcon("D:\\workspaceJAVA\\java\\java04\\007.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째 버튼을 눌렀군요..!!!");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("궁서", Font.BOLD, 23));
		btnNewButton.setBounds(100, 29, 320, 61);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setToolTipText("회원가입 화면으로 넘어갑니다.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\workspaceJAVA\\java\\java04\\member2.png"));
		btnNewButton_1.setBounds(100, 125, 320, 419);
		getContentPane().add(btnNewButton_1);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnNewButton, btnNewButton_1}));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWin3 win3 = new MyWin3();
	}
}
