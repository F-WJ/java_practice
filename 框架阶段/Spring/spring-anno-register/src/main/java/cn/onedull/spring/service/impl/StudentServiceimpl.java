package cn.onedull.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.onedull.spring.dao.IStudentDAO;
import cn.onedull.spring.service.IStudentService;

@Service
public class StudentServiceimpl implements IStudentService {

	@Autowired
	private IStudentDAO StudentDAO;
	
	
	public void setStudentDAO(IStudentDAO studentDAO) {
		StudentDAO = studentDAO;
	}

	
	//数据发送到DAO层
	@Override
	public void save(String username, String password) {
		StudentDAO.save(username, password);

	}

}
