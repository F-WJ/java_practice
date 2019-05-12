package onedull_2.umis.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Template {
	private  static Connection conn = null;
	private  static PreparedStatement ps = null;
	private static ResultSet rs = null;

	public static void dml(String sql, Object... params){
			try{
				//sql语句
				conn = JDBCUtil.connection();
				ps = conn.prepareStatement(sql);
				//设置值
				for (int j = 0; j < params.length; j++) {
					ps.setObject(j + 1, params[j]);
				}
				//执行sql语句
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				JDBCUtil.close(null, ps, conn);
			}
	}
	
	
	public static <T> List dql(String sql, Class<T> cls, Object... params){
		List<Object> list = new ArrayList<>();
		try {
			conn = JDBCUtil.connection();
			ps = conn.prepareStatement(sql);
			//获取预编译语句对象
			ps = conn.prepareStatement(sql);
			//执行sql语句
			rs = ps.executeQuery();
			BeanInfo bi = Introspector.getBeanInfo(cls, Object.class);
			PropertyDescriptor[] pds = bi.getPropertyDescriptors();
			while(rs.next()){
				T t = cls.newInstance();
				for (PropertyDescriptor pd : pds) {
					Object value = rs.getObject(pd.getName());
					Method md = pd.getWriteMethod();
					md.invoke(t, value);
				}
				list.add(t);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
		}
		return list;
		
	}
}
