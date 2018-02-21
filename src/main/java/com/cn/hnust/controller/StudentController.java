package com.cn.hnust.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.pojo.Course;
import com.cn.hnust.pojo.Student;
import com.cn.hnust.service.PageService;
import com.cn.hnust.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/findS")//����������ѧ��
	public ModelAndView getByName(String name,Model model){
		ModelAndView mav = new ModelAndView();
		List<Student>list=studentService.findByName(name);
		model.addAttribute("list", list);
		mav.setViewName("list2");
		return mav;
	}
	/*����ѧԱid����*/
	@RequestMapping("/findS2")
	public ModelAndView getById(int id,Model model){
		ModelAndView mav = new ModelAndView();
		Student student=studentService.findById(id);
		model.addAttribute("student", student);
		mav.setViewName("list3");
		return mav;
	}
	
	@RequestMapping("/updateS")//ת���޸�ҳ��
	public String toUpdate(int id,Model model){
		Student student =(Student) studentService.findById(id);
		model.addAttribute("student", student);//��������
		return "edit";
	}
	@RequestMapping("/addS")//���
	public ModelAndView toAddStudent(Model model,@Param("id")int id,@Param("name")String name,
			@Param("className")String className,@Param("age")int age,@Param("sex")String sex,@Param("teacherId")int teacherId){
		ModelAndView mav = new ModelAndView();
		Student student = new Student();
		student.setAge(age);
		student.setClassName(className);
		student.setName(name);
		student.setSex(sex);
		student.setTeacherId(teacherId);
		student.setId(id);
		if(student.getId()<70){
			studentService.addStudent(student);//�޸�
		}else{
			studentService.insertStudent(student);//����
		}		
		mav.setViewName("list");
		return mav;
	}
	//ת������ҳ��
	@RequestMapping("/insertS")
	public String toInsert(){
		return "edit";
	}
	
	//ɾ��
	@RequestMapping("/deleteS")
	public ModelAndView toDelete(@Param("id")int id){
		ModelAndView mav = new ModelAndView();
		studentService.deleteStudent(id);
		mav.setViewName("list");
		return mav;		
	}
   //��ѯ���У������γ���Ϣ
	@RequestMapping(value="/queryAll")
	public String toFindAll(Model model){
		List<Student>list =studentService.findAll();
		model.addAttribute("list", list);
		
		return "list4";
	}
	
}
