package com.himal.school.model;

import java.util.List;

public class Course {

	private Long id;
	private String name;
	private Kakshya kakshya;
	private List<Teacher> teachers;
	private List<Assignment> assignment;
	private List<Exam> exams;

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

	public Kakshya getKakshya() {
		return kakshya;
	}

	public void setKakshya(Kakshya kakshya) {
		this.kakshya = kakshya;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(List<Assignment> assignment) {
		this.assignment = assignment;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

}
