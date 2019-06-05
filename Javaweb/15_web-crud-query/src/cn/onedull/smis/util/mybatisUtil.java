package cn.onedull.smis.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisUtil {
	private mybatisUtil(){};
	private static SqlSessionFactory factory;
	
	static{
		 try {
			 //创建连接池对象
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-cfg.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		//获取数据库对象
		SqlSession session = factory.openSession();
		return session;
	}
	
	
}
