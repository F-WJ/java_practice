package cn.onedull._02_key;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidUtil {
	private static Properties ps = new Properties();
	private static DataSource ds = null;
	private DruidUtil(){};
	
	static{
		try {
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
			ps.load(in);
			ds = DruidDataSourceFactory.createDataSource(ps);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection connection() throws Exception{
		Connection conn  = ds.getConnection();
		return conn;
	}

	
	
	public static void close(ResultSet rs, PreparedStatement ps, Connection conn){
		try {
			if(rs != null ){
				rs.close();	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(ps != null ){
				ps.close();	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn != null ){
				conn.close();	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

