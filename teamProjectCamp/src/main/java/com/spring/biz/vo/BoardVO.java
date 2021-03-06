package com.spring.biz.vo;

import java.util.Date;


public class BoardVO {
	
	private int boardNum; 
	private String boardWriter; 
	private String boardTitle; 
	private String boardContent; 
	private int boardCnt; 
	private String boardDate;
	private String delDate;
	private String delYn;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getBoardCnt() {
		return boardCnt;
	}
	public void setBoardCnt(int boardCnt) {
		this.boardCnt = boardCnt;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getDelDate() {
		return delDate;
	}
	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardCnt=" + boardCnt + ", boardDate=" + boardDate
				+ ", delDate=" + delDate + ", delYn=" + delYn + "]";
	}
	 

	
	
	
	





}
