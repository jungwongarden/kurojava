package office;

import java.sql.DriverManager;

//import java.lang.*;

public class ConnectorTest {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공.!! ");
		
		String url = "jdbc:mysql://localhost:3306/computer";
		String user = "root";
		String password = "1234";
		
		DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공.!! ");
	}
}

