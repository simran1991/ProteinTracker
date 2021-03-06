package com.proteinTracker.queries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Users {
	private int id;
	private String name;
	
	
	public Users(){
		setProteinData(new ProteinData());
	}
	//creating entity in hibernate for one to one
	private ProteinData proteinData;
	
	//creating entity type collection using List implementation
	private List<UserHistory> history=new ArrayList<UserHistory>();
	
	//creating goalAlert
	private Set<GoalAlert> goalAlerts=new HashSet<GoalAlert>();
	
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
		proteinData.setUser(this);
	}
	public List<UserHistory> getHistory() {
		return history;
	}
	public void setHistory(List<UserHistory> history) {
		this.history = history;
	}
	/**
	 * here we make relation birectional
	 * @param historyItem
	 */
	public void addHistory(UserHistory historyItem){
		historyItem.setUser(this);
		history.add(historyItem);
	}
	public Set<GoalAlert> getGoalAlerts() {
		return goalAlerts;
	}
	public void setGoalAlerts(Set<GoalAlert> goalAlerts) {
		this.goalAlerts = goalAlerts;
	}
	
}
