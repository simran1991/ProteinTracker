package com.protienTracker.Utils;

import java.util.ArrayList;
import java.util.List;



public class Users {
	private int id;
	private String name;
	
	//creating components in hibernate that is nest value type to USrs object
	private ProteinData proteinData=new ProteinData();
	
	//creating value type collection using List implementation
	private List<UserHistory> history=new ArrayList<UserHistory>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProteinData getProteinData() {
		return proteinData;
	}
	public void setProteinData(ProteinData proteinData) {
		this.proteinData = proteinData;
	}
	public List<UserHistory> getHistory() {
		return history;
	}
	public void setHistory(List<UserHistory> history) {
		this.history = history;
	}
	
	
	
}
