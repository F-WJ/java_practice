package cn.onedull.spring.dao.impl;


import javax.sql.DataSource;

import com.mysql.jdbc.Connection;

import cn.onedull.spring.dao.IStudentDAO;

public class StudentDAOImpl implements IStudentDAO {
	//获取连接池
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Override
	public void save(String name, String password) {
		Connection connection = null;
		//connection = dataSource.getConnection();
		

	}

}
