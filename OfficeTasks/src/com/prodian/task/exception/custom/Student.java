package com.prodian.task.exception.custom;

public class Student {

	private int totalRating;
	
	private int totalCount;
	
	private String name;

	public Student(int totalRating, int totalCount, String name) {
		super();
		this.totalRating = totalRating;
		this.totalCount = totalCount;
		this.name = name;
	}

	public int getTotalRating() {
		return totalRating;
	}

	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
