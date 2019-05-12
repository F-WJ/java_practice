package cn.onedull._02_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.junit.Test;
/*
 * 
 * 总结：
 * 在使用setXXX的方法的时候注意索引（?的总数）的范围
 */
public class DMLEmplyeeTest {
	@Test
	public void testInsert() throws Exception {
		//sql语句
		String sql = "INSERT employee(name, salary) VALUES(? , ?)";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语言对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//设置值
		ps.setString(1, "小锤");
		ps.setObject(2, 7600.333);
		//执行sql语句
		ps.executeUpdate(sql);
		//释放资源
		ps.close();
		conn.close();
	}
	
	@Test
	public void testDelete() throws Exception {
		//sql语句
		String sql = "DELETE FROM employee WHERE id = ?";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语言对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//设置值
		ps.setInt(1, 2);
		//执行sql语句
		ps.executeUpdate();
		//释放资源
		ps.close();
		conn.close();
		
	}
	
	@Test
	public void testUpdate() throws Exception {
		//sql语句
		String sql = "UPDATE employee SET salary = ? WHERE id = ?;";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语言对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//设置值
		ps.setObject(1, 3000.5);
		ps.setInt(2, 3);
		//执行sql语言
		ps.executeUpdate();
		//释放资源
		ps.close();
		conn.close();
	}
	
	@Test
	public void testSelect() throws Exception {
		//sql语句
		String sql = "SELECT * FROM employee";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语言对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//执行sql语言
		ResultSet eq = ps.executeQuery();
		Employee em = new Employee();
		ArrayList<Employee> list = new ArrayList<>();
		//循环遍历
		while(eq.next()){
			em.setName(eq.getString("name"));
			em.setSalary(eq.getObject("salary"));
			list.add(em);
		}
		System.out.println(list);
		//释放资源
		eq.close();
		ps.close();
		conn.close();
	}
}
