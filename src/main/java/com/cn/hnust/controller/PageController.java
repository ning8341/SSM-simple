package com.cn.hnust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.service.PageService;
import com.cn.hnust.service.StudentService;

@Controller
public class PageController {
	@Autowired
	private PageService pageService;
	@Autowired
	private StudentService studentService;
	//分页处理  
    @RequestMapping("/list")    
    public ModelAndView getPage(@RequestParam(defaultValue="1")int currentPage,Model model){      
       ModelAndView mav = new ModelAndView();     
       model.addAttribute("pagemsg",pageService.findByPage(currentPage) );//回显分页数据 
       mav.setViewName("list");  
       return mav;   
    }
    

}
