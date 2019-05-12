package cn.onedull._01_ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

/*
 * 步骤：
 * 1.加载注册驱动
 * 2.获取数据库连接对象
 * 3.获取预编译语句对象
 * 4.执行sql语句
 * 5.释放资源
 * 
 * 总结：
 * 
 * 
 */
public class ConnectionTest {
	@Test
	public void testCreateStudent() throws Exception {
		//sql语句
		String sql = "CREATE TABLE student_2(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20) DEFAULT NULL, age BIGINT(11) DEFAULT NULL);";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/message", "root", "123456");
		//获取预编译语句对象
		Statement st = conn.createStatement();
		//执行sql语句
		st.executeUpdate(sql);
		//释放资源
		st.close();
		conn.close();
	}
	
	
	@Test
	public void testCreateEmployee() throws Exception {
		//sql语句
		String sql = "CREATE TABLE employee(id BIGINT(20) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), salary 	DECIMAL(8, 2))";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库交接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语句对象
		Statement st = conn.createStatement();
		//执行sql语句
		st.executeUpdate(sql);
		//释放资源
		st.close();
		conn.close();
	}
}
