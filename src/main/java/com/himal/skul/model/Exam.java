package com.himal.skul.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String description;
	private Double fullMarks;
	private Double passMarks;
	private Double weightage;
	private Date dateOfExam;
	
	@Enumerated
	private ExamType examType;
	
	private Date deadline;
	
	@OneToMany
	private List<Result> result;
	
	public ExamType getExamType() {
		return examType;
	}

	public void setExamType(ExamType examType) {
		this.examType = examType;
	}

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

	public Double getFullMarks() {
		return fullMarks;
	}

	public void setFullMarks(Double fullMarks) {
		this.fullMarks = fullMarks;
	}

	public Double getPassMarks() {
		return passMarks;
	}

	public void setPassMarks(Double passMarks) {
		this.passMarks = passMarks;
	}

	public Double getWeightage() {
		return weightage;
	}

	public void setWeightage(Double weightage) {
		this.weightage = weightage;
	}

	public Date getDateOfExam() {
		return dateOfExam;
	}

	public void setDateOfExam(Date dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
