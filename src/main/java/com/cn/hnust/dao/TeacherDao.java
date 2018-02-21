package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Teacher;

/*操作数据库*/
public interface TeacherDao {
	
	
	List<Teacher> queryTeacher();//查老师信息，无条件查找
	
	List<Teacher> queryStudents();//直接查询老师对学生

}
