package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public ProductDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public ProductDTO select(ProductDTO dto) throws Exception {
		con = dbcp.getConnection();
		
		// 3. SQL문 객체화
		String sql = "select * from product where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		ProductDTO dto2 = new ProductDTO();
		if(rs.next()) {
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			int price = rs.getInt(4);
			String img = rs.getString(5);
			
			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setPrice(price);
			dto2.setImg(img);
			
		}
		ps.close();
		con.close();
		
		
		return dto2;
	}
	
	public ArrayList<ProductDTO> totalList() throws Exception {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		//1. 드라이버 셋팅+DB연결
		con = dbcp.getConnection();
		
		String sql = "select * from product";
		ps = con.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		ProductDTO dto = null;
		while(rs.next()) {
			dto = new ProductDTO();
			dto.setId(rs.getString(1));
			dto.setTitle(rs.getString(2));
			dto.setContent(rs.getString(3));
			dto.setPrice(rs.getInt(4));
			dto.setImg(rs.getString(5));
			list.add(dto);
		}
		
		//자원해제
		dbcp.freeConnection(con, ps, rs);
		
		return list;
	}
	
	
	
}
