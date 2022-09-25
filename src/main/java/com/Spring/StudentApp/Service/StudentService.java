package com.Spring.StudentApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.Spring.StudentApp.entity.Student;
import com.Spring.StudentApp.Repository.StudentRepository;

public interface StudentService {
	List<Student> findAllStudents();

	void saveStudent(Student student);

	void deleteStudent(long id);

}
