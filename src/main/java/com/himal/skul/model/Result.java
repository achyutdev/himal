package com.himal.skul.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Result {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private StudentKakshya student;
	private Double marksObtained;
	private String remarks;
	private boolean examAttended;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StudentKakshya getStudent() {
		return student;
	}

	public void setStudent(StudentKakshya student) {
		this.student = student;
	}

	public Double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(Double marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isExamAttended() {
		return examAttended;
	}

	public void setExamAttended(boolean examAttended) {
		this.examAttended = examAttended;
	}

}
