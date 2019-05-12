package onedull_2.umis.dao.impl;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import onedull_2.umis.dao.IUserDAO;
import onedull_2.umis.domain.User;
import onedull_2.umis.util.JDBCUtil;
import onedull_2.umis.util.Template;




public class UserDAOImpl implements IUserDAO{

	@Override
	public void save(User user) {
		String sql = "INSERT INTO user(username, age) VALUES(?, ?);";
		Template.dml(sql, user.getUserName(), user.getAge());
	}

	@Override
	public void delete(Long id) {
		//sql语句
		String sql = "DELETE FROM user WHERE id = ?";
		Template.dml(sql, id);	
	}

	@Override
	public void update(User user) {
		//sql语句
		String sql = "UPDATE user SET username = ?, age = ? WHERE id = ?";
		Template.dml(sql, user.getUserName(), user.getAge(), user.getId());
	}

	@Override
	public List<User> get(User user, Long id) {
		String sql = "SELECT * FROM user";
		List list = Template.dql(sql, user.getClass(), id);
		return list;
	}















}
