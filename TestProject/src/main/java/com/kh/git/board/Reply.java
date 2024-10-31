package com.kh.git.board;

public class Reply {
	private String comment;
	private int userNo;
	public Reply() {
		super();
	}
	public Reply(String comment, int userNo) {
		super();
		this.comment = comment;
		this.userNo = userNo;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	
}
