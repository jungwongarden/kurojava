package shop;

//JAVA-DB-Connectivity(JDBC)
import java.sql.*;
import java.util.ArrayList;

public class FoodDAO {

	public ArrayList<FoodDTO> selectAll() throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "select * from food";
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		ArrayList<FoodDTO> list = new ArrayList<>();
		
		while(rs.next()) {
			FoodDTO dto2 = new FoodDTO();
			String id = rs.getString(1);
			String favorite = rs.getString(2);
			String dislike = rs.getString(3);
			
			dto2.setId(id);
			dto2.setFavorite(favorite);
			dto2.setDislike(dislike);
			
			list.add(dto2);
		}
		rs.close();
		ps.close();
		con.close();
		
		
		return list;
	}
	
	public FoodDTO select(FoodDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "select * from food where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4. SQL문 실행 요청
		ResultSet rs = ps.executeQuery();
		
		FoodDTO dto2 = new FoodDTO();
		if(rs.next()) {
			String id = rs.getString(1);
			String favorite = rs.getString(2);
			String dislike = rs.getString(3);
			
			dto2.setId(id);
			dto2.setFavorite(favorite);
			dto2.getDislike();
		}
		rs.close();
		ps.close();
		con.close();
		
		return dto2;
	}

	public void update(MemberDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, dto.getId());
		ps.setString(1, dto.getTel());

		// 4. SQL문 실행 요청
		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void delete(MemberDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());

		// 4. SQL문 실행 요청
		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void insert(FoodDTO dto) throws Exception {
		// 1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");

		// 2. DB연결
		String url = "jdbc:mysql://localhost:3306/shop"; // db명
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. SQL문 객체화
		String sql = "insert into food values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getFavorite());
		ps.setString(3, dto.getDislike());

		// 4. SQL문 실행 요청
		ps.executeUpdate();

		ps.close();
		con.close();
	}
}
