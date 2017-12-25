package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Student;

public interface StudentDao {
	
	List <Student>  findByName(String name);//����������ѯ���ݿ⣬���ض�����¼,�п�����������

	Student getById(int id);//����id��ȡѧ����Ϣidֵ��ҳ������EL�󶨵�ֵ

	void updateStudent(Student student);//����ѧ����Ϣ

	void insertStudent(Student student);//����ѧԱ��Ϣ
	void deleteStudent(int id);

}
