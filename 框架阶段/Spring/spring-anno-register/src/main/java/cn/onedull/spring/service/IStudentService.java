package cn.onedull.spring.service;

import cn.onedull.spring.dao.impl.StudentDAOImpl;

public interface IStudentService {
	
	void save(String name, String password);
}
