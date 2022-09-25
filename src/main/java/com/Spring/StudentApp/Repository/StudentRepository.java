package com.Spring.StudentApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.StudentApp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{ 
	

}
