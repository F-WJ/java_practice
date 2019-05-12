package cn.onedull.emis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JDBCUtil {
	private static Properties pt = null;
	private static DataSource ds = null;
	
	static{
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取配置文件
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
			pt = new Properties();
			pt.load(in);
			ds = DruidDataSourceFactory.createDataSource(pt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private JDBCUtil(){};
	public static Connection connection(){
		try {
			//Druid连接池
			Connection conn = ds.getConnection();
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void close(ResultSet rs, PreparedStatement ps, Connection conn){
		try {
			if(rs != null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(ps != null){
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
