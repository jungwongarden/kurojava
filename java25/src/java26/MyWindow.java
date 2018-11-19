package java26;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Label;

public class MyWindow extends JFrame{
	JButton	b1 = new JButton("나는 버튼이야...나를 눌러..");
	
	public MyWindow() {
		getContentPane().setLayout(new FlowLayout());
		setSize(600, 478);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("나도 버튼이야!!.. 새로 생겼지..!!");
		b2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("내게 왔군...!!!");
			}
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("나를 떠났군...!!!");
			}
		});
		b2.setIcon(new ImageIcon("D:\\workspaceJAVA\\java\\java04\\member1.png"));
		b2.setToolTipText("나를 눌러봐..!!..나는 도움말...");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나도 눌러졌네......ㅎㅎ");
			}
		});
		
		JButton button = new JButton("ㅂ버벅버그그");
		getContentPane().add(button);
		getContentPane().add(b2);
		
		Label label = new Label("New label");
		getContentPane().add(label);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌렀구나..!! 잘했어...!!");
				b1.setText("나로 바뀌었어...");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow win = new MyWindow();
	}

}
