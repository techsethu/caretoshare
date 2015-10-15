package com.bubblesoft.model;

public class Discussion {
	
	String name;
	String Description;
	
	public Discussion() {};
	public Discussion(String nam, String desc) {
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
