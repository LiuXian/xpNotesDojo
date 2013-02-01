package com.example.xpnotesdojo.entity;

import javax.persistence.Entity;

@Entity
public class Note extends BaseEntity {
	private Long user_id;
	private Long topic_id;
	private String title;
	private String content;
	private String date;
	
	public String getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getUser_id() {
		return user_id;
	}
	
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getTopic_id() {
		return topic_id;
	}
	
	public void setTopic_id(Long topic_id) {
		this.topic_id = topic_id;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
}
