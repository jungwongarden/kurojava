package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//기본 생성자
	//생성자: 객체 생성시 자동 호출되는 메소드
	//객체생성시 꼭 해주어야하는 초기화 과정
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public void insert(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getUser());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	
	public ArrayList<BbsDTO> totalList() throws Exception {
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		
		//1. 드라이버 셋팅+DB연결
		con = dbcp.getConnection();
		
		String sql = "select * from bbs";
		ps = con.prepareStatement(sql);
		
		rs = ps.executeQuery();
		
		BbsDTO dto = null;
		while(rs.next()) {
			dto = new BbsDTO();
			dto.setId(rs.getString(1));
			dto.setTitle(rs.getString(2));
			dto.setContent(rs.getString(3));
			dto.setUser(rs.getString(4));
			list.add(dto);
		}
		
		//자원해제
		dbcp.freeConnection(con, ps, rs);
		
		return list;
	}
	
}
