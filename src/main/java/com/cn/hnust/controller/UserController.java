package com.cn.hnust.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;
import com.cn.hnust.utils.LoginInterceptor;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	//转到登录页面
	@RequestMapping("/login")
	public String toLogin(){
		return "index";
	}
	//登录控制
	@RequestMapping("/toindex")
	 public String login(User user,HttpServletRequest request,HttpSession httpSession,HttpServletResponse response) throws Exception{
		httpSession.setAttribute("username", user.getUserName());
        //锟斤拷锟斤拷login锟斤拷锟斤拷锟斤拷锟斤拷证锟角凤拷锟斤拷注锟斤拷锟矫伙拷
        boolean loginType = userService.login(user.getUserName(),user.getPassword());		 
			if (loginType&&(new LoginInterceptor().blogin(request, response))) {				
				// 锟斤拷锟斤拷锟街ね拷锟�,锟斤拷锟矫伙拷锟斤拷息锟斤拷锟斤拷前台
				request.setAttribute("user", user);			
				return "main";
			} else {
				// 锟斤拷锟斤拷锟斤拷,锟津将达拷锟斤拷锟斤拷息锟斤拷示锟斤拷锟斤拷锟斤拷页锟斤拷
				request.setAttribute("message", "锟矫伙拷锟斤拷锟斤拷锟斤拷锟斤拷锟�");
				return "error";
			}

		
	}
	//跳转到注册页面
	@RequestMapping("/register")
	public String toIndex(Model model ,String username,String password){		
		return "register";
	}
	//注册控制
	@RequestMapping("/afregister")
	public String toRegister(User user,Model model){
		boolean loginType = userService.login(user.getUserName(),user.getPassword());
		if(!loginType){//锟饺诧拷询锟斤拷没锟叫革拷锟矫伙拷锟斤拷锟斤拷锟斤拷锟絋锟斤拷去
			userService.register(user);			
			return "main";
		}else{
			model.addAttribute("message","娌℃湁杩欎釜璐︽埛鍝�");
			return "error";
		}
		
	}
	
	//登出控制
	   @RequestMapping(value = "/logout")
	   public String logout(HttpSession session) throws Exception {
	       //session.removeAttribute("user");
	       session.invalidate();
	       return "index";
	   }
	 
	/**
	 * 写一个导出excel的功能
	 */
	@RequestMapping("/export")
	@ResponseBody
	public void export(HttpServletResponse response) {
		response.setContentType("application/binary;charset=UTF-8");
		/*ServletOutputStream out = response.getOutputStream();
		String fileName=new String(("UserInfo "+ new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getBytes(),"UTF-8");
		response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");*/		
		String[] titles = { "用户编号", "用户姓名", "用户密码", "用户邮箱","用户手机" };
		userService.export(titles);
		
	}
}

