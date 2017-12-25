package com.cn.hnust.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.pojo.Student;
import com.cn.hnust.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/findS")//根据姓名查学生
	public ModelAndView getByName(String name,Model model){
		ModelAndView mav = new ModelAndView();
		List<Student>list=studentService.findByName(name);
		model.addAttribute("list", list);
		mav.setViewName("list2");
		return mav;
	}
	@RequestMapping("/updateS")//转到修改页面
	public String toUpdate(int id,Model model){
		Student student =studentService.findById(id);
		model.addAttribute("student", student);//回显数据
		return "edit";
	}
	@RequestMapping("/addS")//添加
	public ModelAndView toAddStudent(Model model,@Param("id")int id,@Param("name")String name,
			@Param("className")String className,@Param("age")int age,@Param("sex")String sex,@Param("teacherId")int teacherId){
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setAge(age);
		student.setClassName(className);
		student.setName(name);
		student.setSex(sex);
		student.setteacherId(teacherId);
		student.setId(id);
		if(student.getId()<70){
			studentService.addStudent(student);//修改
		}else{
			studentService.insertStudent(student);//新增
		}		
		mav.setViewName("list");
		return mav;
	}
	//转到新增页面
	@RequestMapping("/insertS")
	public String toInsert(){
		return "edit";
	}
	
	//
	@RequestMapping("/deleteS")
	public ModelAndView toDelete(@Param("id")int id){
		ModelAndView mav = new ModelAndView();
		studentService.deleteStudent(id);
		mav.setViewName("list");
		return mav;		
	}

}
