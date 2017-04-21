package com.spring.model;

public class Instance {
	private String LoadState;
	private String Description;
	private String state;
	private int MainPID;
	private String Id;
	private String ActiveState;
	private String SubState;
	public String getLoadState() {
		return LoadState;
	}
	public void setLoadState(String loadState) {
		LoadState = loadState;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getMainPID() {
		return MainPID;
	}
	public void setMainPID(int mainPID) {
		MainPID = mainPID;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getActiveState() {
		return ActiveState;
	}
	public void setActiveState(String activeState) {
		ActiveState = activeState;
	}
	public String getSubState() {
		return SubState;
	}
	public void setSubState(String subState) {
		SubState = subState;
	}
	
	
}
