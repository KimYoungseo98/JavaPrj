package com.kosa.myapp.in;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {

	// 변수가 추가되거나 바뀌더라도 이전의 클래스와 같은 클래스야!!
	private static final long serialVersionUID = 7533517070060784384L;

	// value Object: 값을 저장하는 객체
	 private int bno;
	   private String title;
	   private String content;
	   private String writer;
	   private Date date;
	   
	   public Board() {}
	   public Board(int bno, String title, String content, String writer, Date date) {
	      super();
	      this.bno = bno;
	      this.title = title;
	      this.content = content;
	      this.writer = writer;
	      this.date = date;
	   }

	   public int getBno() {
	      return bno;
	   }

	   public void setBno(int bno) {
	      this.bno = bno;
	   }

	   public String getTitle() {
	      return title;
	   }

	   public void setTitle(String title) {
	      this.title = title;
	   }

	   public String getContent() {
	      return content;
	   }

	   public void setContent(String content) {
	      this.content = content;
	   }

	   public String getWriter() {
	      return writer;
	   }

	   public void setWriter(String writer) {
	      this.writer = writer;
	   }

	   public Date getDate() {
	      return date;
	   }

	   public void setDate(Date date) {
	      this.date = date;
	   }

	   public static long getSerialversionuid() {
	      return serialVersionUID;
	   }

	   public String toCSV() {
	      return bno + "," + title + "," + content + "," + writer + "," + date;
	   }

}
