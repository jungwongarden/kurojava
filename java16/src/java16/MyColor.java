package java16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyColor implements ActionListener {
	static JButton red, blue, green, amuguna;
	static String[] redArray, blueArray, greenArray;
	static JLabel img;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 색깔 버튼들...");
		f.setSize(300, 400);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		img = new JLabel();
		
		red = new JButton("<<<<<<<<< 빨강 >>>>>>>>>");
		blue = new JButton("<<<<<<<<< 파랑  >>>>>>>>>");
		green = new JButton("<<<<<<<<< 초록  >>>>>>>>>");
		amuguna = new JButton("<<<<<<<<< 아무거나  >>>>>>>>>");

		redArray = new String[3];
		for (int i = 0; i < redArray.length; i++) {
			redArray[i] = "red" + i + ".png";
		}
		
		blueArray = new String[3];
		for (int i = 0; i < blueArray.length; i++) {
			blueArray[i] = "blue" + i + ".png";
		}
		
		greenArray = new String[3];
		for (int i = 0; i < greenArray.length; i++) {
			greenArray[i] = "green" + i + ".png";
		}
		
		f.add(red); f.add(blue); f.add(green); f.add(amuguna);
		f.add(img);
		MyColor color = new MyColor();
		red.addActionListener(color);
		blue.addActionListener(color);
		green.addActionListener(color);
		amuguna.addActionListener(color);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random r = new Random();
		int select = r.nextInt(3);
		if (e.getSource() == red) {
			ImageIcon icon = new ImageIcon(redArray[select]);
			img.setIcon(icon);
		}
		if (e.getSource() == blue) {
			ImageIcon icon = new ImageIcon(blueArray[select]);
			img.setIcon(icon);
		}
		if (e.getSource() == green) {
			ImageIcon icon = new ImageIcon(greenArray[select]);
			img.setIcon(icon);
		}
		if (e.getSource() == amuguna) {
			int colorSelect = r.nextInt(3);
			if (colorSelect == 0) {
				ImageIcon icon = new ImageIcon(redArray[select]);
				img.setIcon(icon);
			}else if(colorSelect == 1) {
				ImageIcon icon = new ImageIcon(blueArray[select]);
				img.setIcon(icon);
			}else {
				ImageIcon icon = new ImageIcon(greenArray[select]);
				img.setIcon(icon);
			}
		}
		

	}

}
