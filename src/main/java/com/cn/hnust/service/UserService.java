package com.cn.hnust.service;



import com.cn.hnust.pojo.User;

public interface UserService  {

	boolean login(String userName, String password);//是否登录

	void register(User user);//注册
	
    User reLogin(String userName);
    
    void export(String[] titles);//导出excel
}
