package com.cn.hnust.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.PageDao;
import com.cn.hnust.pojo.Page;
import com.cn.hnust.pojo.Student;
import com.cn.hnust.service.PageService;
@Service
public class PageSeviceImpl implements PageService {
    @Autowired
    private PageDao pageDao;
	public int selectCount() {  
        return pageDao.selectCount();  
   }  
   public Page<Student> findByPage(int currentPage) {  
       Map<String,Object> map = new HashMap<String,Object>();  
       Page<Student> page = new Page<Student>();  
       //��װ��ǰҳ��  
       page.setCurrPage(currentPage);  
 
       //ÿҳ��ʾ������  
       int pageSize=10;  
       page.setPageSize(pageSize);  
 
       //��װ�ܼ�¼��  
       int totalCount = pageDao.selectCount();  
       page.setTotalCount(totalCount);  
 
       //��װ��ҳ��  
       double tc = totalCount;  
       Double num =Math.ceil(tc/pageSize);//����ȡ��  
       page.setTotalPage(num.intValue());  
       map.put("start",(currentPage-1)*pageSize);  
       map.put("size", page.getPageSize());  
       //��װÿҳ��ʾ������  
       List<Student> lists = pageDao.findByPage(map);  
       page.setLists(lists);  
 
       return page;  
   }
}