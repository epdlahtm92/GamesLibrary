package com.gamesLibrary.domain;

import java.sql.Date;

public class Reply {
	
	private int replyId;
	private int rootId;
	private String category;
	private String userName;
	private String content;
	private Date postDate;
	
	
	public Reply() {
		super();
	}
	
	public int getReplyId() {
		return replyId;
	}public Reply(int replyId, int rootId, String category, String userName, String content, Date postDate) {
		super();
		this.replyId = replyId;
		this.rootId = rootId;
		this.category = category;
		this.userName = userName;
		this.content = content;
		this.postDate = postDate;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getRootId() {
		return rootId;
	}
	public void setRootId(int rootId) {
		this.rootId = rootId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	
	
	
	
	
	
}
