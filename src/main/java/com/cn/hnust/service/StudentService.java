package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Course;
import com.cn.hnust.pojo.Student;

public interface StudentService {
	
	List<Student>  findByName(String name);
	
    List<Student> findAll();
    
	Student findById(int id);

	void addStudent(Student student);
	
	void insertStudent(Student student);
     
	void deleteStudent(int id);
}
