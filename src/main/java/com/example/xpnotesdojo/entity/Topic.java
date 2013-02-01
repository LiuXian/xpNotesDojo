package com.example.xpnotesdojo.entity;

import javax.persistence.Entity;

@Entity
public class Topic extends BaseEntity {
	private Long user_id;
	private String content;
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Long getUser_id() {
		return user_id;
	}
	
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
}
