package office;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Member implements ActionListener {
	static JLabel id = new JLabel("ID ");
	static JLabel pw = new JLabel("PW ");
	static JLabel name = new JLabel("NAME ");
	static JLabel tel = new JLabel("TEL ");
	static JTextField idF = new JTextField(25);
	static JPasswordField pwF = new JPasswordField(25);
	static JTextField nameF = new JTextField(25);
	static JTextField telF = new JTextField(25);

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 1050);
		f.setTitle("MEMBER");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JLabel img1 = new JLabel();
		JLabel img2 = new JLabel();

		JButton b1 = new JButton("INSERT");
		JButton b2 = new JButton("RESET");
		f.add(img1);
		f.add(id);
		f.add(idF);
		f.add(pw);
		f.add(pwF);
		f.add(name);
		f.add(nameF);
		f.add(tel);
		f.add(telF);
		f.add(b1);
		f.add(b2);
		f.add(img2);
		ImageIcon icon1 = new ImageIcon("member1.png");
		ImageIcon icon2 = new ImageIcon("member2.png");
		img1.setIcon(icon1);
		img2.setIcon(icon2);
		Member m = new Member();
		b1.addActionListener(m);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String gId = idF.getText();
		String gPw = pwF.getText();
		String gName = nameF.getText();
		String gTel = telF.getText();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("1...");
			String url = "jdbc:mysql://localhost:3306/computer";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. Computer DB ..");

			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3...");
			ps.setString(1, gId);
			ps.setString(2, gPw);
			ps.setString(3, gName);
			ps.setString(4, gTel);

			ps.executeUpdate();
			System.out.println("4...");

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
