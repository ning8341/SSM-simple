package com.cn.hnust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.Teacher;
import com.cn.hnust.service.TeacherService;

@Controller
public class TeacherContorller {
  
	 @Autowired
	 private TeacherService teacherService;
	 @RequestMapping("/queryTE")
	 public String toFindTeacher(Model model){
		 List <Teacher> list =  teacherService.findTeacher();
		 model.addAttribute("list", list);
		 return "l_teacher";
	 }
	 
	 @RequestMapping("/queryT")
	 public String toFindTeacherAndStudent(Model model){
		 List <Teacher> list =  teacherService.findTeacherAndStudent();
		 model.addAttribute("list", list);
		 System.out.println(list);
		 System.out.println("==============================");		 
		 System.out.println(list.size());
		 return "l_teacher_student";
	 }
	 
}
