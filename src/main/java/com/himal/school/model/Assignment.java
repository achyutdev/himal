package com.himal.school.model;

import java.util.Date;

public class Assignment {

	private Long id;
	private String name;
	private String description;
	private int finalWeightage;
	private int fullMarks;
	private Date deadline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getFinalWeightage() {
		return finalWeightage;
	}

	public void setFinalWeightage(int finalWeightage) {
		this.finalWeightage = finalWeightage;
	}

	public int getFullMarks() {
		return fullMarks;
	}

	public void setFullMarks(int fullMarks) {
		this.fullMarks = fullMarks;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
