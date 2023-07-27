package com.gamesLibrary.domain;

public class Board {
	private int rootId;
	private int postId;
	private String title;
	private String content;
	private String userName;
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(int rootid, int postid, String title, String content, String user) {
		super();
		this.rootId = rootid;
		this.postId = postid;
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
	
	
	
	
}
