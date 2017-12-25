package com.cn.hnust.pojo;

import java.sql.Date;

/*
 * 项目介绍实体类
 */
public class Project {
	private String name;
	private Date projecTime;
	private String context;
	private String skills;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getProjecTime() {
		return projecTime;
	}

	public void setProjecTime(Date projecTime) {
		this.projecTime = projecTime;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", projecTime=" + projecTime + ", context=" + context + ", skills=" + skills
				+ "]";
	}

}
