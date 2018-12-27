package com.Trendshop.dto;

public class AddressVO {  
  private String zipNum;
  private String sido;
  private String gugun;
  private String dong;
  private String zipCode;
  private String bunji;
  
  public String getzipNum() {
    return zipNum;
  }
  public void setzipNum(String zipNum) {
    this.zipNum = zipNum;
  }
  public String getSido() {
    return sido;
  }
  public void setSido(String sido) {
    this.sido = sido;
  }
  public String getGugun() {
    return gugun;
  }
  public void setGugun(String gugun) {
    this.gugun = gugun;
  }
  public String getDong() {
    return dong;
  }
  public void setDong(String dong) {
    this.dong = dong;
  }
  public String getzipCode() {
    return zipCode;
  }
  public void setzipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  public String getBunji() {
    return bunji;
  }
  public void setBunji(String bunji) {
    this.bunji = bunji;
  }
}
