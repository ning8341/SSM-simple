package com.cn.hnust.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	public boolean blogin(HttpServletRequest request,HttpServletResponse response) throws IOException{
	String requestURI = request.getRequestURI();
	// ���ҳ��������login���ж��Ƿ��Ѿ���¼
	if(!requestURI.contains("/login")){
		String username = 
		   (String) request.getSession().getAttribute("username");
		// �ж�session�Ƿ����
		if (username == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}
	}
	return true;
	}
}
