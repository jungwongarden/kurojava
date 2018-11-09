package java06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SiteDownLoad {

	public static void main(String[] args) throws Exception {
		String site = "http://www.google.com";
		URL url = new URL(site);
		URLConnection con = url.openConnection();
		
		//사이트에서 읽어오는 통로를  make
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inLine;

		//그 파일이 끝나기 전까지 계속 읽어와서 콘솔에 프린트!!
		while ((inLine = in.readLine()) != null)
			System.out.println(inLine);
		in.close();

	}

}
