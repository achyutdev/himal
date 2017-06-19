package com.himal.skul;

import java.util.List;

import com.himal.skul.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();

	public Student addStudent(Student student);

}
