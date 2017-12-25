package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserDao;
import com.cn.hnust.pojo.User;

import com.cn.hnust.service.UserService;
@Service("UserService")
public class UserSeviceImpl implements UserService {
    @Resource
    private  UserDao  userDao;
    


	public User getUserByName(String username) {		
		User user=userDao.selectUserByName(username);
		return user;
	}

	// 登录方法的实现,从jsp页面获取username与password
	public boolean login(String userName, String password) {
		// 对输入账号进行查询,取出数据库中保存对信息
		User user = userDao.selectUserByName(userName);
		if (user != null) {
			System.out.println("---------");
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;

	}
    //注册方法的实现
	public void register(User user) {
		userDao.insertUser(user);	
	}

	

	

	

}
