package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MemberDAO {
	public void delete(String id) throws Exception {
		//1. 드라이버(connector) 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB연결(->my서버설정+db명+id+pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. SQL문 객체화
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		
		//4. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("SQL문 요청 완료..");
	}
	
	public void insert(MemberDTO dto) throws Exception {
		//1. 드라이버(connector) 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB연결(->my서버설정+db명+id+pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. SQL문 객체화
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("SQL문 요청 완료..");
	}
		
		public ArrayList<MemberDTO> selectAll() throws Exception {
			// 1. 드라이버(connector) 셋팅
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB연결(->my서버설정+db명+id+pw)
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);

			// 3. SQL문 객체화
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);

			// 4. SQL문 실행 요청
			ResultSet rs = ps.executeQuery();
			System.out.println("start " + rs.getRow());
			
			//해당 row index의 값이 존재하는가? 체크..
			//System.out.println(rs.first());
			//System.out.println(rs.absolute(1));
			
			//해당 ResultSet의 갯수를 구하는 방법..==========
			//rs의 맨 끝으로 이동
			//rs.last();
			//그 맨 끝의 getRow()를 출력
			//System.out.println("레코드의 갯수는 " + rs.getRow());
			
			
			MemberDTO dto = null;
			ArrayList<MemberDTO> list = new ArrayList<>();
			
			while (rs.next()) { // 커서를 옮겨서 레코드가 있는지 체크
				System.out.println("row: " + rs.getRow());
				dto = new MemberDTO();

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);

				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);
				
				list.add(dto);
				System.out.println();
			}
			return list;
		}

		public MemberDTO select(String input) throws Exception {
			// 1. 드라이버(connector) 셋팅
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB연결(->my서버설정+db명+id+pw)
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);

			// 3. SQL문 객체화
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, input);

			// 4. SQL문 실행 요청
			ResultSet rs = ps.executeQuery();
			MemberDTO dto = null;
			while (rs.next()) { // 커서를 옮겨서 레코드가 있는지 체크
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
		
		public void login(String input1, String input2) throws Exception {
			// 1. 드라이버(connector) 셋팅
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB연결(->my서버설정+db명+id+pw)
			String url = "jdbc:mysql://localhost:3306/computer";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);

			// id와 pw 맞는지 체크-방법1
			String sql = "select * from member where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, input1);
			ps.setString(2, input2);

			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("아이디: " + rs.getString(1));
				System.out.println("패스워드: " + rs.getString(2));
				System.out.println("로그인 성공.");
			}else {
				System.out.println("로그인 실패.");
			}
			System.out.println();
			
			// id와 pw 맞는지 체크-방법2
			String sql2 = "select count(*) from member where id = ? and pw = ?";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setString(1, input1);
			ps2.setString(2, input2);

			ResultSet rs2 = ps2.executeQuery();
			rs2.next();
			if(rs2.getInt(1) == 1) {
				System.out.println("로그인 성공.");
			}else {
				System.out.println("로그인 실패.");
			}
		
		}

}

