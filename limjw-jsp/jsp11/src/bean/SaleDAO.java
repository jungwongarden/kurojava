package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SaleDAO {
	
	public ArrayList<SaleDTO> select() throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "select * from sale";
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		ArrayList<SaleDTO> list = new ArrayList<SaleDTO>();
		
		while(rs.next()) {
			SaleDTO dto = new SaleDTO();
			
			String iid = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String price = rs.getString(4);
			String img = rs.getString(5);
			
			dto.setId(iid);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setPrice(price);
			dto.setImg(img);
			
			list.add(dto);
		}
		return list;
		
		
		
		
		
		
		
		
	}
	public SaleDTO select(String id) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "select * from sale where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		SaleDTO dto = new SaleDTO();
		
		if(rs.next()) {
			String iid = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String price = rs.getString(4);
			String img = rs.getString(5);
			
			dto.setId(iid);
			dto.setTitle(title);
			dto.setContent(content);
			dto.setPrice(price);
			dto.setImg(img);
		}
		return dto;
		
		
		
		
		
		
		
		
	}
}
