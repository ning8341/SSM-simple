package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Teacher;

/*�������ݿ�*/
public interface TeacherDao {
	
	
	List<Teacher> queryTeacher();//����ʦ��Ϣ������������
	
	List<Teacher> queryStudents();//ֱ�Ӳ�ѯ��ʦ��ѧ��

}
