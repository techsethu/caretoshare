package com.bubblesoft.model;

public class Dashboard {
	
	String name;
	String Description;
	
	public Dashboard() {};
	public Dashboard(String nam, String desc) {
		name = nam;
		Description = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
