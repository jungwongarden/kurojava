package com.Trendshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBManager;

import com.Trendshop.dto.MemberVO;
import com.Trendshop.dto.OrderVO;

public class MemberDAO {

  private MemberDAO() {
  }

  private static MemberDAO instance = new MemberDAO();

  public static MemberDAO getInstance() {
    return instance;
  }

  public int confirmID(String userid) {
	int result = -1;
    String sql = "select * from trendshopmember where id=?";
       
    Connection connn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    try {
      connn = DBManager.getConnection();
      pstmt = connn.prepareStatement(sql);
      pstmt.setString(1, userid);
      rs = pstmt.executeQuery();
      if (rs.next()) { 
        result = 1;
      } else { 
        result = -1;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(connn, pstmt, rs);
    }
    return result;
  }

  public MemberVO getMember(String id) {       
    MemberVO memberVO= null;
    String sql = "select * from trendshopmember where id=?";
     
    Connection connn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      connn = DBManager.getConnection();
      pstmt = connn.prepareStatement(sql);
      pstmt.setString(1, id);
      rs = pstmt.executeQuery();
      if(rs.next()){
        memberVO = new MemberVO();
        memberVO.setId(rs.getString("id"));
        memberVO.setPwd(rs.getString("pwd"));
        memberVO.setName(rs.getString("name"));
        memberVO.setEmail(rs.getString("email"));
        memberVO.setZipNum(rs.getString("zip_num"));
        memberVO.setAddress(rs.getString("address"));
        memberVO.setPhone(rs.getString("phone"));
        memberVO.setUseyn(rs.getString("useyn"));
        memberVO.setIndate(rs.getTimestamp("indate"));
      } 
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(connn, pstmt, rs);
    }
    return memberVO;
  }

  public int insertMember(MemberVO memberVO) {
    int result = 0;
    String sql = "insert into trendshopmember(id, pwd, name, zip_num,";
    sql += " address, phone) values(?, ?, ?, ?, ?, ?)";

    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, memberVO.getId());      
      pstmt.setString(2, memberVO.getPwd());
      pstmt.setString(3, memberVO.getName());
      pstmt.setString(4, memberVO.getZipNum());
      pstmt.setString(5, memberVO.getAddress());
      pstmt.setString(6, memberVO.getPhone());
      result = pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
    return result;
  }
  
	/* *
	 * 관리자 모드에서 사용되는 메소드 * *
	 */
	public ArrayList<MemberVO> listMember(String member_name) {
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		String sql = "select * from trendshopmember where name like '%'||?||'%' " +
				"order by indate desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			if (member_name == "") {
				pstmt.setString(1, "%");
			} else {
				pstmt.setString(1, member_name);
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberVO memberVO = new MemberVO();
				memberVO.setId(rs.getString("id"));
		        memberVO.setPwd(rs.getString("pwd"));
		        memberVO.setName(rs.getString("name"));
		        memberVO.setEmail(rs.getString("email"));
		        memberVO.setZipNum(rs.getString("zip_num"));
		        memberVO.setAddress(rs.getString("address"));
		        memberVO.setPhone(rs.getString("phone"));
		        memberVO.setUseyn(rs.getString("useyn"));
		        memberVO.setIndate(rs.getTimestamp("indate"));
		        memberList.add(memberVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return memberList;
	}
}
