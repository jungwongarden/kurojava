package java31;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String name = "c:/temp";
		File file = new File(name);
		System.out.println("존재유무: " + file.exists());
		System.out.println("폴더유무: " + file.isDirectory());
		
		String[] list = file.list();
		System.out.println("폴더 아래 리스트 갯수 " + list.length + "개");
		for (String s : list) {
			System.out.println(name+"/"+s);
			File f = new File(name+"/"+s);
			if(f.isFile()) {
				System.out.println(s + "는 파일입니다.");
			}
			if(f.isDirectory()) {
				System.out.println(s + "는 폴더입니다.");
			}
		}
	}
}
