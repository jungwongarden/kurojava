package com.Trendshop.dto;

import java.sql.Timestamp;

public class OrderVO {
  private int odseq;
  private int oseq;
  private String id; 
  private Timestamp indate; 
  private String mname;
  private String zipNum;
  private String address;
  private String phone;  
  private int pseq;
  private String pname;
  private int quantity;
  private int price2;  
  private String result;    
  
  public int getOdseq() {
    return odseq;
  }
  public void setOdseq(int odseq) {
    this.odseq = odseq;
  }
  public int getPrice2() {
    return price2;
  }
  public void setPrice2(int price2) {
    this.price2 = price2;
  }
  public int getOseq() {
    return oseq;
  }
  public void setOseq(int oseq) {
    this.oseq = oseq;
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
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }
  public String getZipNum() {
    return zipNum;
  }
  public void setZipNum(String zipNum) {
    this.zipNum = zipNum;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public Timestamp getIndate() {
    return indate;
  }
  public void setIndate(Timestamp indate) {
    this.indate = indate;
  }
@Override
public String toString() {
	return "OrderVO [odseq=" + odseq + ", oseq=" + oseq + ", id=" + id
			+ ", indate=" + indate + ", mname=" + mname + ", zipNum=" + zipNum
			+ ", address=" + address + ", phone=" + phone + ", pseq=" + pseq
			+ ", pname=" + pname + ", quantity=" + quantity + ", price2="
			+ price2 + ", result=" + result + "]";
}  
  
}
