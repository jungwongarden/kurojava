package com.Trendshop.dto;

import java.sql.Timestamp;

public class MemberVO {
  private String id;
  private String pwd;
  private String name;
  private String email;
  private String zipNum;
  private String address;
  private String phone;
  private String useyn;
  private Timestamp indate;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  public String getUseyn() {
    return useyn;
  }
  public void setUseyn(String useyn) {
    this.useyn = useyn;
  }
  public Timestamp getIndate() {
    return indate;
  }
  public void setIndate(Timestamp indate) {
    this.indate = indate;
  }
}
