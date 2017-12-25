package com.cn.hnust.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.Student;

public interface PageDao {
	// 查询用户记录总数
	int selectCount();
	// 分页操作，调用findByPage limit分页方法
    List<Student> findByPage(Map<String, Object> map);

}
