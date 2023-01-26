package com.mc.mvc.book.dto;

import java.time.LocalDateTime;

public class Book {
	
	//`BK_IDX`, `ISBN`, `CATEGORY`, `TITLE`, `AUTHOR`, `INFO`, `BOOK_AMT`, `REG_DATE`, `RENT_CNT`
	private int bkIdx;
	private String Isbn;
	private String Category;
	private String Title;
	private String Author;
	private String Info;
	private int BookAmt;
	private LocalDateTime RegDate;
	private int RentCnt;
	
	public int getBkIdx() {
		return bkIdx;
	}
	public void setBkIdx(int bkIdx) {
		this.bkIdx = bkIdx;
	}
	public String getIsbn() {
		return Isbn;
	}
	public void setIsbn(String isbn) {
		Isbn = isbn;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
	public int getBookAmt() {
		return BookAmt;
	}
	public void setBookAmt(int bookAmt) {
		BookAmt = bookAmt;
	}
	public LocalDateTime getRegDate() {
		return RegDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		RegDate = regDate;
	}
	public int getRentCnt() {
		return RentCnt;
	}
	public void setRentCnt(int rentCnt) {
		RentCnt = rentCnt;
	}
	
	@Override
	public String toString() {
		return "Book [bkIdx=" + bkIdx + ", Isbn=" + Isbn + ", Category=" + Category + ", Title=" + Title + ", Author="
				+ Author + ", Info=" + Info + ", BookAmt=" + BookAmt + ", RegDate=" + RegDate + ", RentCnt=" + RentCnt
				+ "]";
	}
	
	
	

}
