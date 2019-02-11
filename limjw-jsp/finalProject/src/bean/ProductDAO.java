package bean;

import java.sql.Connection;
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
