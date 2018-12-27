package java31;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWriterTest3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 정보를 입력하세요.");
		System.out.print("ID : ");
		String id = sc.next();
		Writer file = new FileWriter(id + ".txt");
		
		File f = new File(id +".txt");
		if(f.exists()) System.out.println(id + ".txt 파일이  생성되었습니다. ");
		System.out.print("PW : ");
		String pw = sc.next();
		
		System.out.print("NAME : ");
		String name = sc.next();
		
		System.out.print("TEL : ");
		String tel = sc.next();
		
		file.write(id+"\r\n");
		file.write(pw+"\r\n");
		file.write(name+"\r\n");
		file.write(tel+"\r\n");
		
		file.flush();
		file.close();
		System.out.println(f.length()-8);
	}
}


