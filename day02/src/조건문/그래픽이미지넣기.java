package 조건문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 그래픽이미지넣기 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(500, 500);
		
		JButton button = new JButton("\uC774\uBBF8\uC9C0\uB123\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가위를 누르셨군요.");
				Random r = new Random();
				//0->가위, 1->바위, 2->보
				int computer = r.nextInt(3);
				if(computer == 0) { //가위
					f.setTitle("비겼음");
					System.out.println("비겼음.");
				}else if(computer == 1) { //바위
					f.setTitle("f.setTitle(\"비겼음\");");
					System.out.println("컴퓨터 승.");
				}else {
					f.setTitle("내가 승.");
					System.out.println("내가 승.");
				}
			}
		});
		button.setIcon(new ImageIcon("D:\\aliciawill\\day02\\\uAC00\uC704.jpg"));
		f.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uBC14\uC704");
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("\uBCF4");
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		f.setVisible(true);		
	}

}
