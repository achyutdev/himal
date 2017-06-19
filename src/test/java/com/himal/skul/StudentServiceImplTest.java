package com.himal.skul;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.himal.skul.model.Student;

@RunWith(SpringRunner.class)
public class StudentServiceImplTest {
	
	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public StudentService employeeService() {
            return new StudentServiceImpl();
        }
    }
	
	@Autowired
    private StudentService studentService;
	
	@MockBean
    private StudentRepository studentRepository;
	
	private static final  String STUDENT_NAME = "Achyut";
	
	@Before
	public void setUpStudents(){
		Student student = new Student();
		student.setFirstName(STUDENT_NAME);
		List<Student> students  = Arrays.asList(student);
		Mockito.when(studentRepository.findAll()).thenReturn(students);
		
	}
	
	@Test
	public void getAllEmployees(){
		
		Student student = new Student();
		student.setFirstName(STUDENT_NAME);
		List<Student> actualStudents = Arrays.asList(student);
		List<Student> studentsFound = studentService.getAllStudents();
		assertThat(actualStudents.get(0).getFirstName().equals(studentsFound.get(0).getFirstName()));
	}

}
