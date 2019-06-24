package cn.onedull.spring.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.onedull.spring.dao.IStudentDAO;

@Component
public class StudentDAOImpl implements IStudentDAO {
	//获取连接池
	@Autowired
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Override
	public void save(String username, String password) {
		Connection connection = null;
		try {
			//连接
			connection = dataSource.getConnection();
			//预编译
			PreparedStatement ps = connection.prepareStatement("INSERT INTO student(username, password) VALUES(?, ?);");
			//执行sql
			ps.setString(1, username);
			ps.setString(2, password);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
