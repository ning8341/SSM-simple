package com.cn.hnust.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.Student;

public interface PageDao {
	// ��ѯ�û���¼����
	int selectCount();
	// ��ҳ����������findByPage limit��ҳ����
    List<Student> findByPage(Map<String, Object> map);

}
