package home;

import javax.swing.JOptionPane;

public class LoginCheck {

	public static void main(String[] args) {
		String id 
			= JOptionPane.showInputDialog("id를 입력하세요.");
		int result = JOptionPane.showConfirmDialog(null, "당신이 입력한 id가 " + id + "값이 맞습니까? ");
		System.out.println(result);
		//0, 1, 2, -1
		if(result == 0) {
			System.out.println("올바르게 입력하셨군요.");
			for (int i = 0; i < 12; i++) {
				System.out.print("축하 ");
			}
		}else if(result == 1){
			System.out.println("입력값이 올바르지 않습니다.");
		}else {
			System.out.println("취소를 선택했습니다.");
		}
		
		
		
		
		
		
		
	}

}
