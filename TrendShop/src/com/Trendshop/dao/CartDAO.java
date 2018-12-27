package com.Trendshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBManager;

import com.Trendshop.dto.CartVO;

public class CartDAO {

  private CartDAO() {
  }

  private static CartDAO instance = new CartDAO();

  public static CartDAO getInstance() {
    return instance;
  }

  public void insertCart(CartVO cartVO) {
    String sql = "insert into cart(cseq,id, pseq, quantity)" +
    		" values(cart_seq.nextval,?, ?, ?)";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, cartVO.getId());
      pstmt.setInt(2, cartVO.getPseq());
      pstmt.setInt(3, cartVO.getQuantity());
      pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  }

  public ArrayList<CartVO> listCart(String userId) {
    ArrayList<CartVO> cartList = new ArrayList<CartVO>();    
    String sql = "select * from cart_view where id=? order by cseq desc";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, userId);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        CartVO cartVO = new CartVO();
        cartVO.setCseq(rs.getInt(1));
        cartVO.setId(rs.getString(2));
        cartVO.setPseq(rs.getInt(3));
        cartVO.setMname(rs.getString(4));
        cartVO.setPname(rs.getString(5));
        cartVO.setQuantity(rs.getInt(6));
        cartVO.setIndate(rs.getTimestamp(7));
        cartVO.setPrice2(rs.getInt(8));
        cartList.add(cartVO);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      DBManager.close(conn, pstmt, rs);
    }
    return cartList;
  }

  public void deleteCart(int cseq) {
    String sql = "delete cart where cseq=?";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
      conn = DBManager.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, cseq);
      pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBManager.close(conn, pstmt);
    }
  }
}
