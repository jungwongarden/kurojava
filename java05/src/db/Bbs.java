package db;

import java.sql.DriverManager;

public class Bbs {

	public static void main(String[] args) throws Exception {
		//1.
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "1234";
		DriverManager.getConnection(url, user, password);
		System.out.println("DB연결 성공...");
		//3.
		//4.
	}

}
