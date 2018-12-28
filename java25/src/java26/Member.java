package java26;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Member extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public Member() {
		getContentPane().setBackground(Color.GREEN);
		getContentPane().setForeground(Color.BLUE);
		getContentPane().setFont(new Font("굴림", Font.BOLD, 18));
		setTitle("회원가입 화면입니다.");
		setSize(550, 513);
		JLabel	intro = new JLabel("회원가입을 진행합니다.");
		intro.setBackground(Color.YELLOW);
		intro.setFont(new Font("굴림", Font.BOLD, 18));
		intro.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().setLayout(null);
		intro.setBounds(104, 10, 340, 44);
		getContentPane().add(intro);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(42, 100, 100, 30);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(42, 150, 100, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(38, 200, 100, 30);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_3.setBounds(42, 250, 100, 30);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setToolTipText("아이디는 8글자 이내로");
		textField.setBackground(Color.PINK);
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		textField.setBounds(190, 100, 269, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("숫자, 문자, 특수기호 포함 10글자 이내");
		textField_1.setBackground(Color.PINK);
		textField_1.setForeground(Color.BLUE);
		textField_1.setFont(new Font("굴림", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(190, 150, 269, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("10글자 이내로");
		textField_2.setBackground(Color.PINK);
		textField_2.setForeground(Color.BLUE);
		textField_2.setFont(new Font("굴림", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(190, 200, 269, 21);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("-를 넣어서 입력해주세요.");
		textField_3.setBackground(Color.PINK);
		textField_3.setForeground(Color.BLUE);
		textField_3.setFont(new Font("굴림", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(190, 250, 269, 21);
		getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("회원가입완료");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(139, 364, 282, 50);
		getContentPane().add(btnNewButton);
		
		setVisible(true);
	}
}
