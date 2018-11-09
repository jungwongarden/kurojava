package office;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Manager implements ActionListener {
	static JTextField t1 = new JTextField(15);
	static JPasswordField t2 = new JPasswordField(15);

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(230, 500);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		String name = JOptionPane.showInputDialog("관리자 이름을 입력하세요");

		f.setTitle(name + "의 두번째 그래픽 프로그램");

		JLabel label = new JLabel("<<<<<<<<< " + name + "가 관리하는 프로그램입니다. >>>>>>>>>");
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("006.png");
		img.setIcon(icon);
		ImageIcon icon2 = new ImageIcon("007.png");
		JButton login = new JButton();
		login.setIcon(icon2);

		JLabel id = new JLabel("ID:  ");
		JLabel pw = new JLabel("PW:  ");

		t2.setEchoChar('■');

		f.add(label);
		f.add(img);
		f.add(id);
		f.add(t1);
		f.add(pw);
		f.add(t2);
		f.add(login);

		Manager m = new Manager();
		login.addActionListener(m);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 누르셨군요....");
		String id = t1.getText();
		String pw = t2.getText();
		System.out.println("당신의 id는 " + id);
		System.out.println("당신의 pw는 " + pw);
		String oriId = "root";
		String oriPw = "1234";

		if (oriId.equals(id)) {
			System.out.println("ID가 제대로 입력되었습니다.");
		} else {
			System.out.println("ID가 올바르지 않습니다.");
		}
	}
}
