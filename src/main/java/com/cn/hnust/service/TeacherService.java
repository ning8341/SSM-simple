package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Teacher;

public interface TeacherService {
	
   List<Teacher>	findTeacher();
   
   List<Teacher> findTeacherAndStudent();
}
