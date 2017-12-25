package com.cn.hnust.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.ProjectDao;
import com.cn.hnust.pojo.Project;
import com.cn.hnust.service.ProjectSevice;
@Service
public class ProjectServiceImpl implements ProjectSevice {
    @Autowired
    private ProjectDao projectDao;
	public Project getByName(String name) {
		Project project = projectDao.findByName(name);
		return project;
	}
	

}
