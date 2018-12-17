package office;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Manager {

	
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
		
		JTextField t1 = new JTextField(15) {
            @Override
            public void setBorder(Border border) {
                
            }
		};
		JPasswordField t2 = new JPasswordField(15);
		t2.setEchoChar('■');
		
		f.add(label);
		f.add(img);
		f.add(id); f.add(t1);
		f.add(pw); f.add(t2);		
		f.add(login);
		f.setVisible(true);
	}
}
