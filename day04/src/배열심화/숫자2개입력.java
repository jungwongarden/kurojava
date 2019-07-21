package 배열심화;

import javax.swing.JOptionPane;

public class 숫자2개입력 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("숫자1입력");
		String data2 = JOptionPane.showInputDialog("숫자2입력");
		
		int n1 = Integer.parseInt(data1);
		int n2 = Integer.parseInt(data2);
		
		int n3 = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "두 수의 합은 " + n3);
	}

}
