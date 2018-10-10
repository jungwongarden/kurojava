package com.itbank.mvc03;
import java.sql.*;
import java.util.List;

import org.springframework.stereotype.Repository;

//@Repository
//test...git hub....
public class DaoMem {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	String sql = null;
	Mem mem = null;
	
//	한 사람에 대한 정보=> select문
	public Mem getUser(String id) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver로딩 성공");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flower", "root", "1234");
			System.out.println("DB연결 성공");
			
			sql = "select * from member where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			System.out.println("select 성공");
			
			mem = new Mem();
			
			if(rs.next()) {
				mem.setId(rs.getString(1));
				mem.setPw(rs.getString(2));
				mem.setName(rs.getString(3));
				mem.setTel(rs.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {}
			try {
				pstmt.close();
			} catch (Exception e2) {}		
			try {
				rs.close();
			} catch (Exception e2) {}
		}
		return mem;
	}
	
// insert문
	public void insertUser(Mem mem) {
		String sql = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver로딩 성공");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flower", "root", "1234");
			System.out.println("DB연결 성공");
			
			sql = "insert into member values (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPw());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getTel());
			pstmt.executeUpdate();
			System.out.println("insert 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
// delete문
// 전체 회원에 대한 정보 => select문
	/*public List<Mem> getUserList() {

*/		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver로딩 성공");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/daodb", "root", "1234");
			System.out.println("DB연결 성공");
			
			sql = "select * from member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("select 성공");
			
			Mem mem = new Mem();
			List<mem> listMem = new List<mem>();
			if(rs.next()) {
				mem = new Mem();
				mem.setId(rs.getString(1));
				mem.setPw(rs.getString(2));
				mem.setName(rs.getString(3));
				mem.setTel(rs.getString(4));
				daoMem.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {}
			try {
				pstmt.close();
			} catch (Exception e2) {}		
			try {
				rs.close();
			} catch (Exception e2) {}
		}
		return mem;*/

	
}
