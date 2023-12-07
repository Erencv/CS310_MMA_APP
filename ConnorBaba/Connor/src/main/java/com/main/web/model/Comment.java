package com.main.web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {

	@Id
	public String _id;
	public String commentId;
	public String fightId;
	public String userName;
	public String date;
	public String comment;


	public Comment() {}


	public Comment(String _id, String commentId, String fightId, String userName, String date, String comment) {
		super();
		this._id = _id;
		this.commentId = commentId;
		this.fightId = fightId;
		this.userName = userName;
		this.date = date;
		this.comment = comment;
	}


	public Comment(String commentId, String fightId, String userName, String date, String comment) {
		super();
		this.commentId = commentId;
		this.fightId = fightId;
		this.userName = userName;
		this.date = date;
		this.comment = comment;
	}


	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public String getCommentId() {
		return commentId;
	}


	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}


	public String getFightId() {
		return fightId;
	}


	public void setFightId(String fightId) {
		this.fightId = fightId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
}
