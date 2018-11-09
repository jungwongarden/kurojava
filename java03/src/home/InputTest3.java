package home;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputTest3 {

	public static void main(String[] args) {
		//String id2 = JOptionPane.showInputDialog("id를 입력");
		Scanner sc = new Scanner(System.in);
		System.out.print("id입력");
		String id = sc.next();
		JOptionPane.showMessageDialog(null, id);
		String id3 = JOptionPane.showInputDialog("id2를 입력");
		System.out.println(id3);
		
	}

}
