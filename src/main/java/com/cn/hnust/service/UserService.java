package com.cn.hnust.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cn.hnust.pojo.User;

public interface UserService  {

//	User getUserById(int userId);
//    
//	List<User> findAll();
//
//	User getUserByName(String username);

	boolean login(String userName, String password);

	void register(User user);
	

}
