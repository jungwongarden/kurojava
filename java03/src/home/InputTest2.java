package home;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputTest2 {

	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요.");
//		System.out.println("내 이름은 " + name);
//		JOptionPane.showMessageDialog(null, "내 이름은 " + name);
		
		//JOptionPane.showConfirmDialog(null, "당신은 "  + name + "님이 맞습니까?");
		
		Scanner	sc = new Scanner(System.in);
		String id = sc.next();
		System.out.println(id);
		String id2 = JOptionPane.showInputDialog("id를 입력");
		JOptionPane.showMessageDialog(null, id);
		System.out.println(id);
		
		
		
	}

}
