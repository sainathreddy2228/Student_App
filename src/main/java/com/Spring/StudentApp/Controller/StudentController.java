package com.Spring.StudentApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.StudentApp.entity.Student;
import com.Spring.StudentApp.Service.StudentService;

@RestController
public class StudentController {
	StudentService studentserv;

	@Autowired
	public StudentController(StudentService studentserv) {
		this.studentserv = studentserv;

	}

	@GetMapping("/students")

	public List<Student> getAllCourses() {
		return studentserv.findAllStudents();
	}

	@PostMapping("/post")
	public void createStudent(@RequestBody Student student) {
		studentserv.saveStudent(student);
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentserv.deleteStudent(id);
	}

	@PutMapping("/course/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable long id) {
		studentserv.saveStudent(student);
	}

}
