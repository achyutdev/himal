package com.himal.skul;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.himal.skul.model.Student;
import com.himal.skul.util.JsonUtil;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private StudentService studentService;
	
	private static final String STUDENT_NAME = "Ananda";
	
	@Test
	public void getAllStudents() throws Exception{
		
		Student student = new Student();
		student.setFirstName(STUDENT_NAME);
		List<Student> allStudents  = Arrays.asList(student);
		Mockito.when(studentService.getAllStudents())
	      .thenReturn(allStudents);
		
		 mvc.perform(get("/student")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(1)))
			      .andExpect(jsonPath("$[0].firstName", is(student.getFirstName())));
		
	}
	
	@Test
	@Ignore
	public void addStudent() throws Exception{
		
		Student student = new Student();
		student.setFirstName(STUDENT_NAME);
		Mockito.when(studentService.addStudent(student))
	      .thenReturn(student);
		
		 mvc.perform(post("/student")
				  .content(JsonUtil.toJson(student))
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			      .andExpect(jsonPath("$.firstName", is(student.getFirstName())));
		
	}

	
}
