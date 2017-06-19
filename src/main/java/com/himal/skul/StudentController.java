package com.himal.skul;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himal.skul.model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/student")
	public Student addStudent(Student student){
		
		return studentService.addStudent(student);
	}
}
