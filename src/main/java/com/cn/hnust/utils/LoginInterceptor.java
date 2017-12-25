package com.cn.hnust.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	public boolean blogin(HttpServletRequest request,HttpServletResponse response) throws IOException{
	String requestURI = request.getRequestURI();
	// 这个页面请求不是login就判断是否已经登录
	if(!requestURI.contains("/login")){
		String username = 
		   (String) request.getSession().getAttribute("username");
		// 判断session是否存在
		if (username == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}
	}
	return true;
	}
}
