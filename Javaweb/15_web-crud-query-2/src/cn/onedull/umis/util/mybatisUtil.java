package cn.onedull.umis.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisUtil {
	private mybatisUtil(){}
	
	private static SqlSessionFactory factory;
	
	static{
		try {
			//连接池
			factory =  new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-cfg.xml"));
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
