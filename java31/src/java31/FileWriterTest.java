package java31;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("c:/temp/lim2.txt");
		w.write("잘 되어야 해요...!!!\r\n");
		w.write("잘 들어갔나요...\r\n");
		w.write("세번째 데이터가 들어가요....!!!\r\n");
		w.write("마지막 데이터가 들어가요....\r\n");
		w.flush();
		w.close();
	}
}
