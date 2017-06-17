package com.himal.skul.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String description;
	
	@ManyToOne
	private Kakshya kakshya;
	
	@ManyToMany(mappedBy="courses")
	private List<Teacher> teachers;
	
	@OneToMany
	private List<Exam> exams;
	
	@OneToMany
	private List<BookReference> refrences;
	
	@OneToMany
	private List<CourseResource> resources;
	
	@ManyToMany(mappedBy="courses")
	private List<StudentKakshya> studiedBy;
	
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

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<BookReference> getRefrences() {
		return refrences;
	}

	public void setRefrences(List<BookReference> refrences) {
		this.refrences = refrences;
	}

	public List<CourseResource> getResources() {
		return resources;
	}

	public void setResources(List<CourseResource> resources) {
		this.resources = resources;
	}

}
