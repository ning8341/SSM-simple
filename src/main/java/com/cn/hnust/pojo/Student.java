package com.cn.hnust.pojo;

import javax.persistence.Column;

public class Student {
	private int id;
	private String name;
	
	private String className;
	private int age;
	private String sex;//性别gender没使用，用sex吧
	
	private int teacherId;//对应的老师的id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getteacherId() {
		return teacherId;
	}
	public void setteacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + ", age=" + age + ", sex=" + sex
				+ ", teacherId=" + teacherId + "]";
	}
	

}
