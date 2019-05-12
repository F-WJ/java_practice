package cn.onedull.umis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	private JDBCUtil(){};
	
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
