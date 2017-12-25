package com.cn.hnust.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;
import com.cn.hnust.utils.LoginInterceptor;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	//登录页面
	@RequestMapping("/login")
	public String toLogin(){
		return "index";
	}
	//登录
	@RequestMapping("/toindex")
	 public String login(User user,HttpServletRequest request,HttpSession httpSession,HttpServletResponse response) throws Exception{
		httpSession.setAttribute("username", user.getUserName());
        //调用login方法来验证是否是注册用户
        boolean loginType = userService.login(user.getUserName(),user.getPassword());		 
			if (loginType&&(new LoginInterceptor().blogin(request, response))) {				
				// 如果验证通过,则将用户信息传到前台
				request.setAttribute("user", user);			
				return "main";
			} else {
				// 若不对,则将错误信息显示到错误页面
				request.setAttribute("message", "用户名密码错误");
				return "error";
			}

		
	}
	//注册页面
	@RequestMapping("/register")
	public String toIndex(Model model ,String username,String password){		
		return "register";
	}
	//注册成功后返回main页面
	@RequestMapping("/afregister")
	public String toRegister(User user,Model model){
		boolean loginType = userService.login(user.getUserName(),user.getPassword());
		if(!loginType){//先查询有没有该用户，如果有T出去
			userService.register(user);			
			return "main";
		}else{
			model.addAttribute("message","请重新注册");
			return "error";
		}
		
	}
	
	
}

