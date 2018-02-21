package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;
import com.cn.hnust.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	User selectUserByName(String userName);//根据名字查用户
	
	void insertUser(User user);//添加用户

	List  <User>  queryUser();//查询用户
	
	
	
	
	
	
	
	
	

	// int countByExample(UserExample example);
	//
	// int deleteByExample(UserExample example);
	//
	// int deleteByPrimaryKey(Integer id);
	//
	// int insert(User record);
	//
	// int insertSelective(User record);
	//
	// List<User> selectByExample(UserExample example);
	//
	// User selectByPrimaryKey(Integer id);
	//
	// int updateByExampleSelective(@Param("record") User record,
	// @Param("example") UserExample example);
	//
	// int updateByExample(@Param("record") User record, @Param("example")
	// UserExample example);
	//
	// int updateByPrimaryKeySelective(User record);
	//
	// int updateByPrimaryKey(User record);

}