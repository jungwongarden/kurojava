package java19;

import javax.swing.JOptionPane;

public class CalUser2 {

	public static void main(String[] args) {
		Calculator2 cal2 = new          Calculator2();
		cal2.hi("자바");
		cal2.hi("파이썬");
		String n1 = JOptionPane.showInputDialog("숫자1>>" );
		String n2 = JOptionPane.showInputDialog("숫자2>>" );
		                    
		int i1 = Integer.parseInt(n1);
		int i2 = Integer.parseInt(n2);
		
		int result = cal2.mul(i1, i2);
		System.out.println("두 수의 곱은 " + result);
		if(result >= 100) {
			System.out.println("너무 큰값입니다");
		}else {
			System.out.println("아직은 괜찮습니다");
		}
		
		
		
		
		
		
		
	}

}
