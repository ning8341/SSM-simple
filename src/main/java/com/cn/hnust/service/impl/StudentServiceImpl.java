package com.cn.hnust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.StudentDao;
import com.cn.hnust.pojo.Course;
import com.cn.hnust.pojo.Student;
import com.cn.hnust.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	public List<Student> findByName(String name) {
		List <Student>list=studentDao.findByName(name);
		return list;
	}

	 public Student findById(int id) {
		Student student =(Student) studentDao.getById(id);
		return student;
	}

	public void addStudent(Student student) {
		studentDao.updateStudent(student);
		
	}

	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
		
	}

	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
		
	}

	public List<Student> findAll() {
		List<Student> list = studentDao.queryStudentCourse();
		return list;
	}

	

}
