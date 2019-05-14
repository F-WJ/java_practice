package cn.onedull.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory factory = null;
	
	private MybatisUtil(){}
	
	static{
		InputStream in;
		try {
			in = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static SqlSession getSession(){
		SqlSession session = factory.openSession();
		return session;
	}
}
