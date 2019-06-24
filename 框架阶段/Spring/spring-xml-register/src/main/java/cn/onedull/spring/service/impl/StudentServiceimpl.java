package cn.onedull.spring.service.impl;

import cn.onedull.spring.dao.IStudentDAO;
import cn.onedull.spring.service.IStudentService;

public class StudentServiceimpl implements IStudentService {
	private IStudentDAO StudentDAO;
	
	
	public void setStudentDAO(IStudentDAO studentDAO) {
		StudentDAO = studentDAO;
	}

	
	//数据发送到DAO层
	@Override
	public void save(String name, String password) {
		StudentDAO.save(name, password);

	}

}
