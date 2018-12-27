package java31;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberTest extends JFrame implements ActionListener {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JButton btnNewButton_1, btnNewButton;

	public MemberTest() {
		getContentPane().setLayout(null);

		btnNewButton = new JButton("파일로 저장");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(93, 382, 186, 51);
		getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("파일에서 읽기");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(366, 382, 211, 51);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("아이디: ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 19));
		lblNewLabel.setBounds(88, 101, 164, 35);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("아이디: ");
		label.setFont(new Font("굴림", Font.BOLD, 19));
		label.setBounds(88, 101, 164, 35);
		getContentPane().add(label);

		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("굴림", Font.BOLD, 22));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.YELLOW);
		textField_1.setBounds(277, 101, 245, 35);
		getContentPane().add(textField_1);

		JLabel label_1 = new JLabel("이름:");
		label_1.setFont(new Font("굴림", Font.BOLD, 19));
		label_1.setBounds(88, 217, 164, 35);
		getContentPane().add(label_1);

		textField_2 = new JTextField();
		textField_2.setForeground(Color.RED);
		textField_2.setFont(new Font("굴림", Font.BOLD, 22));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.YELLOW);
		textField_2.setBounds(277, 217, 245, 35);
		getContentPane().add(textField_2);

		JLabel label_2 = new JLabel("전화번호: ");
		label_2.setFont(new Font("굴림", Font.BOLD, 19));
		label_2.setBounds(88, 290, 164, 35);
		getContentPane().add(label_2);

		textField_3 = new JTextField();
		textField_3.setForeground(Color.RED);
		textField_3.setFont(new Font("굴림", Font.BOLD, 22));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.YELLOW);
		textField_3.setBounds(277, 290, 245, 35);
		getContentPane().add(textField_3);

		JLabel label_3 = new JLabel("패스워드:");
		label_3.setFont(new Font("굴림", Font.BOLD, 19));
		label_3.setBounds(88, 162, 164, 35);
		getContentPane().add(label_3);

		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("굴림", Font.BOLD, 22));
		textField.setColumns(10);
		textField.setBackground(Color.YELLOW);
		textField.setBounds(277, 162, 245, 35);
		getContentPane().add(textField);

		JLabel label_4 = new JLabel("회원가입화면입니다.");
		label_4.setForeground(Color.RED);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("굴림", Font.BOLD, 24));
		label_4.setBounds(93, 26, 484, 43);
		getContentPane().add(label_4);

		btnNewButton.addActionListener(this);// 저장
		btnNewButton_1.addActionListener(this); // 읽기
		setSize(700, 600);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			FileInputOutput file = new FileInputOutput();
			MemberDTO dto = new MemberDTO();
			dto.setId(textField_1.getText());
			dto.setPw(textField.getText());
			dto.setName(textField_2.getText());
			dto.setTel(textField_3.getText());
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");

			try {
				file.save(dto);
			} catch (Exception e1) {
				System.out.println("파일 저장시 에러 발생....");
			}
		}

		if (e.getSource() == btnNewButton_1) {
			FileInputOutput file = new FileInputOutput();
			String id = textField_1.getText();
			try {
				MemberDTO dto = file.read(id);
				textField_1.setText(dto.getId());
				textField.setText(dto.getPw());
				textField_2.setText(dto.getName());
				textField_3.setText(dto.getTel());
				textField.setForeground(Color.blue);
				textField_1.setForeground(Color.blue);
				textField_2.setForeground(Color.blue);
				textField_3.setForeground(Color.blue);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		new MemberTest();
	}
}
