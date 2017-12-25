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

	// ��¼������ʵ��,��jspҳ���ȡusername��password
	public boolean login(String userName, String password) {
		// �������˺Ž��в�ѯ,ȡ�����ݿ��б������Ϣ
		User user = userDao.selectUserByName(userName);
		if (user != null) {
			System.out.println("---------");
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;

	}
    //ע�᷽����ʵ��
	public void register(User user) {
		userDao.insertUser(user);	
	}

	

	

	

}
