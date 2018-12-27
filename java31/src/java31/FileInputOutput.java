package java31;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FileInputOutput {

	public void save(MemberDTO dto) throws Exception {
		File f = new File(dto.getId() + ".txt");
		FileWriter w = new FileWriter(f);
		
		w.write(dto.getId()+"\r\n");
		w.write(dto.getPw()+"\r\n");
		w.write(dto.getName()+"\r\n");
		w.write(dto.getTel()+"\r\n");
		w.flush();
		w.close();
	}
	
	public void window() {
		JFrame	f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(null);
		JButton b = new JButton("hi");
		b.setBounds(100, 100, 100, 100);
		f.add(b);
		f.setVisible(true);
	}
	
	public MemberDTO read(String id) throws Exception {
		File f = new File(id + ".txt");
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(f);
		dto.setId(sc.nextLine());
		dto.setPw(sc.nextLine());
		dto.setName(sc.nextLine());
		dto.setTel(sc.nextLine());
		sc.close();
		return dto;
	}
	
}
