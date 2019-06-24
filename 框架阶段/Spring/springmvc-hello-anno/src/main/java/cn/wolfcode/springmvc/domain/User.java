package cn.wolfcode.springmvc.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String username;
	private int age;
	
	
	//贴上时间类DateTimeFormat（参数为时间格式）
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date d;
	
	private List<Long> ids = new ArrayList<Long>();

	private Department dept;
	
	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public List<Long> getIds() {
		return ids;
	}


	public void setIds(List<Long> ids) {
		this.ids = ids;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", d=" + d + ", ids=" + ids + "]";
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getD() {
		return d;
	}


	public void setD(Date d) {
		this.d = d;
	}
	
}
