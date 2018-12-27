package java31;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriterTest2 {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("member.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 정보를 입력하세요.");
		System.out.print("ID : ");
		String id = sc.next();
		
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
	}
}
