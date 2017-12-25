package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Student;

public interface StudentDao {
	
	List <Student>  findByName(String name);//根据姓名查询数据库，返回多条记录,有可能有重名的

	Student getById(int id);//根据id获取学生信息id值是页面中用EL绑定的值

	void updateStudent(Student student);//更新学生信息

	void insertStudent(Student student);//插入学员信息
	void deleteStudent(int id);

}
