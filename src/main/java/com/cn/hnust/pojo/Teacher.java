package com.cn.hnust.pojo;

import java.util.List;

public class Teacher {
	private int id;
	private  String name;
	private String age;
	private String sex;
	/*    一对多，添加教师属性，用来映射*/	
	private List<Student> student;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", student=" + student + "]";
	}
	
	
	
	
	

}
