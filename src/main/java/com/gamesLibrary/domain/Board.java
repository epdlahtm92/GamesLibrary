package com.gamesLibrary.domain;

import java.sql.Date;

public class Board {
	
	private int rootId;
	private int postId;
	private String title;
	private String content;
	private String userName;
	private Date postDate;
	
	public Board() {
		super();
	}

	public Board(int rootId, int postId, String title, String content, String user) {
		super();
		this.rootId = rootId;
		this.postId = postId;
		this.title = title;
		this.content = content;
		this.userName = user;
	}

	public int getRootId() {
		return rootId;
	}

	public void setRootId(int rootId) {
		this.rootId = rootId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
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
