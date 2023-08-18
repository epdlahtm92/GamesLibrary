package com.gamesLibrary.domain;

import java.sql.Date;

public class Board {
	
	private int boardId;
	private String title;
	private String content;
	private String userName;
	private Date postDate;
	
	public Board() {
		super();
	}

	public Board(int boardId, String title, String content, String user) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.userName = user;
	}


	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	
	
	
}
