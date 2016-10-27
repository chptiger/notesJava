package com.usernotes.entities;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Note implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer nid;
	@NotNull @Size(max = 50)
	private String title;
	@Size(max = 1000)
	private String note;
	
	@DateTimeFormat(pattern="yyy-mm-dd HH:mm:ss")
	private Date createTime;
	@DateTimeFormat(pattern="yyy-mm-dd HH:mm:ss")
	private Date updateTime;
	private User user;
	

	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Note [nid=" + nid + ", title=" + title + ", note=" + note
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", user=" + user + "]";
	}

}
