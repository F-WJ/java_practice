package cn.onedull.umis.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import cn.onedull.umis.dao.IUserDAO;
import cn.onedull.umis.domain.User;
import cn.onedull.umis.util.JDBCUtil;


public class UserDAOImpl implements IUserDAO{

	@Override
	public void save(User user) {
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			//sql语句
			String sql = "INSERT INTO user(username, age) VALUES(?, ?);";
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语言对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, user.getName());
			ps.setObject(2, user.getAge());
			//执行sql语句
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public void delete(Long id) {
		//sql语句
		String sql = "DELETE FROM user WHERE id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语言对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, id);
			//执行sql语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public void update(User user) {
		//sql语句
		String sql = "UPDATE user SET username = ?, age = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			ps.setObject(1, user.getName());
			ps.setObject(2, user.getAge());
			//执行sql语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
		
	}

	@Override
	public List<User> get() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM user";
		List<User> list = new ArrayList<>();
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//执行sql语句
			rs = ps.executeQuery();
			while(rs.next()){
				User user =new User();
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("username"));
				user.setAge(rs.getInt("age"));
				list.add(user);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
		}
		return list;
	}











}
