package shop;

//JAVA-DB-Connectivity(JDBC)
import java.sql.*;
import java.util.ArrayList;

public class BbsDAO {

	public ArrayList<BbsDTO> selectAll() throws Exception {
		
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. SQL문 객체화
		String sql = "select * from bbs";
		PreparedStatement ps = con.prepareStatement(sql);
		
		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		
		while(rs.next()) {
			BbsDTO dto2 = new BbsDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String user2 = rs.getString(4);
			
			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setUser(user2);
			list.add(dto2);
			
		}
		ps.close();
		con.close();
		
		
		return list;
	}
	public BbsDTO select(BbsDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		BbsDTO dto2 = new BbsDTO();
		if(rs.next()) {
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String user2 = rs.getString(4);
			
			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setUser(user2);
		}
		ps.close();
		con.close();
		
		
		return dto2;
	}

	public void update(BbsDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "update bbs set title=? , content=?, user=? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getContent());
		ps.setString(3, dto.getUser());
		ps.setString(4, dto.getId());

		// 4. SQL문 실행 요청
		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void delete(BbsDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "delete from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4. SQL문 실행 요청
		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void insert(MemberDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());

		// 4. SQL문 실행 요청
		ps.executeUpdate();

		ps.close();
		con.close();
	}
}
