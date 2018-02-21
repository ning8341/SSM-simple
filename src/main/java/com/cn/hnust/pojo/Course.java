package com.cn.hnust.pojo;
 /**
  * 课程类
  * @author 1
  *
  */
public class Course {
	private int id;//课程id
	private String courseName;//课程名称
	private int studentId;//学生id
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", studentId=" + studentId + "]";
	}
	
	

}
