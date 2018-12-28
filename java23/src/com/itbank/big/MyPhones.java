package com.itbank.big;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPhones extends JFrame {

	public MyPhones() {
		setTitle("나의 전화기들");
		setSize(500, 300);
		setLayout(null);
		Random random = new Random();
		JLabel[] tels = new JLabel[100];
		for(int i = 0; i < 100; i++){
			tels[i] = new JLabel("☎");
			tels[i].setForeground(Color.BLUE);
			int x = random.nextInt(500);
			int y = random.nextInt(300);
			tels[i].setBounds(x, y, 20, 20);
			add(tels[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		MyPhones phones = new MyPhones();
	}
}
