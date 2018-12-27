package java31;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerTest {

	public static void main(String[] args) throws Exception {
		//File f = new File("hi3.txt");
		//Scanner sc = new Scanner(f);
		String fileName = JOptionPane.showInputDialog("파일명을 입력해주세요.");
		Scanner sc = new Scanner(new File(fileName + ".txt"));
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
		
		String id = sc.nextLine();
		
		sc.close();
	}
}
