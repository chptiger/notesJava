package com.usernotes.entities;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer uid;
	@NotNull @org.hibernate.validator.constraints.Email
	private String Email;
	@NotNull @Size(min = 8)
	private String Password;
	@DateTimeFormat(pattern="yyy-mm-dd HH:mm:ss")
	private Date createTime;
	@DateTimeFormat(pattern="yyy-mm-dd HH:mm:ss")
	private Date updateTime;
//	private Set notes;
	

	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
//	public Set<Note> getNotes() {
//		return notes;
//	}
//	public void setNotes(Set<Note> notes) {
//		this.notes = notes;
//	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
