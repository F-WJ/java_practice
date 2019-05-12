package cn.onedull.emis.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Template {
	
	//DML操作
	public static void dml(String sql, Object... parmas){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//获取数据库连接对象
			conn = JDBCUtil.connection();
			//获取预编译对象
			ps = conn.prepareStatement(sql);
			//设置值
			for (int i = 0; i < parmas.length; i++) {
				ps.setObject(i + 1, parmas[i]);
			}
			//执行sql语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, ps, conn);
		}
	}
	
	//DQL操作
	public static <T> List dql(String sql, Class<T> cls, Object... parmas){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//获取数据库连接对象
			conn = JDBCUtil.connection();
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//设置值
			for (int i = 0; i < parmas.length; i++) {
				ps.setObject(i + 1, parmas[i]);
			}
			//执行sql语句
			rs = ps.executeQuery();
			//获取属性
			BeanInfo bo = Introspector.getBeanInfo(cls, Object.class);
			List<T> list = new ArrayList<T>();
			while(rs.next()){
				//javabean
				T t = cls.newInstance();
				PropertyDescriptor[] pds = bo.getPropertyDescriptors();
				for (PropertyDescriptor pd : pds) {
					//获取值
					Object value = rs.getObject(pd.getName());
					Method writeMethod = pd.getWriteMethod();
					writeMethod.invoke(t, value);
				}
				list.add(t);
			}
			return list;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
		}
		return null;
	}
}
