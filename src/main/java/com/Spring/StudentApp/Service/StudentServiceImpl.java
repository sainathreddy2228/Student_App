package com.Spring.StudentApp.Service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.Spring.StudentApp.Repository.StudentRepository;
import com.Spring.StudentApp.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	StudentRepository studentrepo;

	@Autowired
	public StudentServiceImpl(StudentRepository studentrepo) {
		this.studentrepo = studentrepo;
	}

	@Override
	public List<Student> findAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		studentrepo.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		studentrepo.deleteById(id);
	}
}
