package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxTestController {
	@RequestMapping("/ajax")
	public String toTestAjax(){	
		return "ajaxtest";
	}
	

}
