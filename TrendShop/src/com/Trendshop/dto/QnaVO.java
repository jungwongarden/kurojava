package com.Trendshop.dto;

import java.sql.Timestamp;

public class QnaVO {
  private int   qseq; 
  private String subject; 
  private String content;
  private String reply;
  private String id; 
  private String rep; 
  private Timestamp indate;
  
  public int getQseq() {
    return qseq;
  }
  public void setQseq(int qseq) {
    this.qseq = qseq;
  }  
  public String getReply() {
    return reply;
  }
  public void setReply(String reply) {
    this.reply = reply;
  }
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getRep() {
    return rep;
  }
  public void setRep(String rep) {
    this.rep = rep;
  }
  public Timestamp getIndate() {
    return indate;
  }
  public void setIndate(Timestamp indate) {
    this.indate = indate;
  }  
}
