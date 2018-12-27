package java35;

import java.sql.*;


public class MemberDAO {

	public MemberDTO select(String input) throws Exception {
		//1. 드라이버(connector) 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB연결(->my서버설정+db명+id+pw)
		String url = "jdbc:mysql://localhost:3306/computer";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. SQL문 객체화
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, input);
		
		//4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		MemberDTO dto = null;
		while(rs.next()) { //커서를 옮겨서 레코드가 있는지 체크
			dto = new MemberDTO();
			
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setTel(tel);
		}
		return dto;
	}
}

