package com.cn.hnust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.TeacherDao;
import com.cn.hnust.pojo.Teacher;
import com.cn.hnust.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
     
	@Autowired
	private TeacherDao teacherDao;
	public List<Teacher> findTeacher() {
		List <Teacher>  teacher = teacherDao.queryTeacher();
		return teacher;
	}

	public List<Teacher> findTeacherAndStudent() {
		List<Teacher>  list = teacherDao.queryStudents();
		return list;
	}

}
