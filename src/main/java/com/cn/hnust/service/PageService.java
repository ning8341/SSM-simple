package com.cn.hnust.service;

import com.cn.hnust.pojo.Page;
import com.cn.hnust.pojo.Student;

public interface PageService {
	//��ҳ����  
    int selectCount();  
  
    Page<Student> findByPage(int currentPage);

}
