package com.himal.skul;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.himal.skul.model.Student;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
