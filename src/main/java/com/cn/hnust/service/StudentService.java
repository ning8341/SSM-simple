package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Student;

public interface StudentService {
	
	List<Student>  findByName(String name);

	Student findById(int id);

	void addStudent(Student student);
	
	void insertStudent(Student student);
     
	void deleteStudent(int id);
}
