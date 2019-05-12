package onedull_2.umis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	private static Properties ps = new Properties();
	private JDBCUtil(){};
	
	static{
		try {
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
			ps.load(in);
			Class.forName(ps.getProperty("driverClassName"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection connection() throws Exception{
		Connection conn  = DriverManager.getConnection(ps.getProperty("url"), ps.getProperty("username"), ps.getProperty("password"));
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
