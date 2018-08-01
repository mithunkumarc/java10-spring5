package com.example.model;

public class RetailStore {
	private int id;
	private String retailStoreName;
	private String location;
	public RetailStore(int id, String retailStoreName, String location) {
		this.id = id;
		this.retailStoreName = retailStoreName;
		this.location = location;
	}
	public RetailStore() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRetailStoreName() {
		return retailStoreName;
	}
	public void setRetailStoreName(String retailStoreName) {
		this.retailStoreName = retailStoreName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
