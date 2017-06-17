package com.himal.skul.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Kakshya {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String year;
	
	private String name;
	
	private int numberOfSection;
	
	// private List<Course> course;
	
	@OneToMany
	private List<StudentKakshya> studentKakshya;
	
	// private List<Teacher> teachers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSection() {
		return numberOfSection;
	}

	public void setNumberOfSection(int numberOfSection) {
		this.numberOfSection = numberOfSection;
	}

	// public List<Course> getCourse() {
	// return course;
	// }
	//
	// public void setCourse(List<Course> course) {
	// this.course = course;
	// }

	public List<StudentKakshya> getStudentKakshya() {
		return studentKakshya;
	}

	public void setStudentKakshya(List<StudentKakshya> studentKakshya) {
		this.studentKakshya = studentKakshya;
	}

	// public List<Teacher> getTeachers() {
	// return teachers;
	// }
	//
	// public void setTeachers(List<Teacher> teachers) {
	// this.teachers = teachers;
	// }

}
