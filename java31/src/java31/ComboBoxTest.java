package java31;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ComboBoxTest extends JFrame {
	Container contentPane;
	String[] fruit = { "사과", "배", "체리" };
	ImageIcon[] images = { 
			new ImageIcon("apple.PNG"), 
			new ImageIcon("pear.PNG"),
			new ImageIcon("cherry.PNG") };

	JLabel imgLabel = new JLabel(images[0]);

	ComboBoxTest() {

		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JComboBox strCombo = new JComboBox(fruit); // 콤보박스 생성

		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource(); // 콤보박스 알아내기
				int index = cb.getSelectedIndex();// 선택된 아이템의 인덱스
				imgLabel.setIcon(images[index]); // 인덱스의 이미지를 이미지 레이블에 출력
			}
		});

		contentPane.add(strCombo);
		contentPane.add(imgLabel);

		setSize(600, 500);
		setVisible(true);

	}

	public static void main(String arg[]) {
		new ComboBoxTest();
	}
}
