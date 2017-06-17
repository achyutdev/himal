package com.himal.skul.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany
	private List<Guardian> guardians;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "student")
	private List<StudentKakshya> studentKakshyas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Guardian> getGuardians() {
		return guardians;
	}

	public void setGuardians(List<Guardian> guardians) {
		this.guardians = guardians;
	}

	public List<StudentKakshya> getStudentKakshyas() {
		return studentKakshyas;
	}

	public void setStudentKakshyas(List<StudentKakshya> studentKakshyas) {
		this.studentKakshyas = studentKakshyas;
	}

}
