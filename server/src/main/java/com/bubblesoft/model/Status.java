package com.bubblesoft.model;

public class Status {

	public Status() {}
	public Status(String nam, Boolean sta) {
		name = nam;
		status = sta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	String name;
	boolean status;
}
