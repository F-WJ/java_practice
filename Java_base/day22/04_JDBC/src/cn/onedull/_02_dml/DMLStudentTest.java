package cn.onedull._02_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class DMLStudentTest {
	@Test
	public void testInsert() throws Exception {
		//sql语句
		String sql = "INSERT student_2(name, age) VALUES(?, ?);";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语句对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//设置值
		ps.setString(1, "小明");
		ps.setInt(2, 18);
		//执行sql命令
		ps.executeUpdate();
		//释放资源
		ps.close();
		conn.close();
		
	}
	
	@Test
	public void testDelete() throws Exception {
		//sql语句
		String sql = "DELETE FROM student_2 WHERE id = ?;";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译对象
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
		String sql = "UPDATE student_2 SET name = ?, age = ? WHERE id = ?;";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语言对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//设置值
		ps.setString(1, "小东");
		ps.setInt(2, 23);
		ps.setObject(3, 1);
		//执行sql语句
		ps.executeUpdate();
		//释放资源
		ps.close();
		conn.close();
	}
	
	@Test
	public void testSelect() throws Exception {
		//sql语句
		String sql = "SELECT * FROM student_2";
		//加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///message", "root", "123456");
		//获取预编译语言对象
		PreparedStatement ps = conn.prepareStatement(sql);
		//执行sql语句
		ResultSet eq = ps.executeQuery();
		Student st = new Student();
		ArrayList<Student> list = new ArrayList<Student>();
		while (eq.next()) {
			st.setId(eq.getInt("id"));
			st.setName(eq.getString("name"));
			st.setAge(eq.getInt("age"));
			list.add(st);
		}
		System.out.println(list);
		//释放资源
		eq.close();
		ps.close();
		conn.close();
	}
}
