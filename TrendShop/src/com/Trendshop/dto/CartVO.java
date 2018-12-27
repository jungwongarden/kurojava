package com.Trendshop.dto;

import java.sql.Timestamp;

public class CartVO {
  private int cseq;
  private String id; 
  private int pseq;
  private String mname;
  private String pname;
  private int quantity;
  private int price2;
  private Timestamp indate;
  
  public int getPrice2() {
    return price2;
  }
  public void setPrice2(int price2) {
    this.price2 = price2;
  }
  
  public int getCseq() {
    return cseq;
  }
  public void setCseq(int cseq) {
    this.cseq = cseq;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public int getPseq() {
    return pseq;
  }
  public void setPseq(int pseq) {
    this.pseq = pseq;
  }
  public String getMname() {
    return mname;
  }
  public void setMname(String mname) {
    this.mname = mname;
  }
  public String getPname() {
    return pname;
  }
  public void setPname(String pname) {
    this.pname = pname;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public Timestamp getIndate() {
    return indate;
  }
  public void setIndate(Timestamp indate) {
    this.indate = indate;
  }  
}
