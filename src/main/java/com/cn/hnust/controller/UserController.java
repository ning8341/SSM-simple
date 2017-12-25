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
	//��¼ҳ��
	@RequestMapping("/login")
	public String toLogin(){
		return "index";
	}
	//��¼
	@RequestMapping("/toindex")
	 public String login(User user,HttpServletRequest request,HttpSession httpSession,HttpServletResponse response) throws Exception{
		httpSession.setAttribute("username", user.getUserName());
        //����login��������֤�Ƿ���ע���û�
        boolean loginType = userService.login(user.getUserName(),user.getPassword());		 
			if (loginType&&(new LoginInterceptor().blogin(request, response))) {				
				// �����֤ͨ��,���û���Ϣ����ǰ̨
				request.setAttribute("user", user);			
				return "main";
			} else {
				// ������,�򽫴�����Ϣ��ʾ������ҳ��
				request.setAttribute("message", "�û����������");
				return "error";
			}

		
	}
	//ע��ҳ��
	@RequestMapping("/register")
	public String toIndex(Model model ,String username,String password){		
		return "register";
	}
	//ע��ɹ��󷵻�mainҳ��
	@RequestMapping("/afregister")
	public String toRegister(User user,Model model){
		boolean loginType = userService.login(user.getUserName(),user.getPassword());
		if(!loginType){//�Ȳ�ѯ��û�и��û��������T��ȥ
			userService.register(user);			
			return "main";
		}else{
			model.addAttribute("message","������ע��");
			return "error";
		}
		
	}
	
	
}

