package com.cn.hnust.pojo;

import java.util.List;

    /**ѧ��ʵ����*/
public class Student {
	private int id;
	private String name;
	private String className;
	private int age;
	private String sex;
	private int teacherId;// ��Ӧ����ʦ��id
	/** һ�Զ࣬��ӿγ����Խ���������ӳ���ϵ */
	private List<Course> course;

	
	
	

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

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + ", age=" + age + ", sex=" + sex
				+ ", teacherId=" + teacherId + ", course=" + course + "]";
	}

	

	

}
