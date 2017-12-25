package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.Project;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.ProjectSevice;

@Controller
public class ProjectController {
	@Autowired
	private ProjectSevice projectService;
    @RequestMapping("/findData")
	@ResponseBody
	public Project findData(Model model,HttpServletRequest request,HttpSession httpSession,HttpServletResponse response){
    	//username�Ǵ�httpSession��ȡ������
    	String name = (String) httpSession.getAttribute("username");
    	System.out.println("��ȡ����ǰ��¼�û���nameΪ��"+name);
    	Project project = projectService.getByName(name);
    	model.addAttribute("project", project);
    	System.out.println(project.toString());
    	return project;
    }
}
