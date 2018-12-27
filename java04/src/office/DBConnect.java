package office;

import java.sql.*;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class DBConnect {

	public static void main(String[] args) throws Exception {
//		1. 연결해주는 것 세팅
//		   (Connector, Driver)
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 셋팅 성공...");
//		2. DB연결
		String url = "jdbc:mysql://localhost:3306/hangul?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. Computer DB 연결 성공...");	
		
//		3. SQL문 결정
		Scanner	sc = new Scanner(System.in);
		System.out.println("회원 정보를 입력하세요..");
		String id = sc.next();

		
		
		String sql = "insert into test values (?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 결정 성공...");
		ps.setString(1, id);

		
//		4. SQL실행 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 실행 요청...");
		
		
		String sql2 = "select * from test";
		PreparedStatement ps2 = con.prepareStatement(sql2);
		ResultSet rs = ps2.executeQuery();
		if(rs.next()) {
			String result = rs.getString(1);
			System.out.println(result);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
