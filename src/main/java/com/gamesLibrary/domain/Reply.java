package com.gamesLibrary.domain;

import java.sql.Date;

public class Reply {

	private int rootId;
	private int postId;
	private String userName;
	private String content;
	private Date postDate;
	private String category;
	
	
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reply(int rootId, int postId, String userName, String content, Date postDate, String category) {
		super();
		this.rootId = rootId;
		this.postId = postId;
		this.userName = userName;
		this.content = content;
		this.postDate = postDate;
		this.category = category;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
