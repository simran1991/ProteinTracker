package com.protienTracker.EntityOneToMany;

import java.util.Date;


public class UserHistory {
	private int id;
	private Users user;
	private Date timestamp;
	private String entry;
	
	public UserHistory(){
		
	}
	
	public UserHistory(Date timestamp, String entry) {
		super();
		this.timestamp = timestamp;
		this.entry = entry;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
