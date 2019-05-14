package cn.onedull.test;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class UserTest {
	@Test
	public void testSave() throws Exception {
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis-config.xml");
		//获取factory对象
		SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
		//获取session对象
		SqlSession session = sqlSession.openSession();
		//执行sql语句
		User user = new User(null, "小凤", new BigDecimal("5000"), new Date());
		session.insert("cn.onedull.UserMapper.save", user);
		//提交事务
		session.commit();
		//释放资源
		session.close();
		System.out.println(user);
	
	}
	
	@Test
	public void testDelete() throws Exception {
		//获取配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//获取factory对象
		SqlSessionFactory sqlsession = new SqlSessionFactoryBuilder().build(in);
		//获取session对象
		SqlSession session = sqlsession.openSession();
		//执行sql文件
		session.insert("cn.onedull.UserMapper.delete", 1L);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testUpdate() throws Exception {
		//获取配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//获取factory对象
		SqlSessionFactory sqlsession = new SqlSessionFactoryBuilder().build(in);
		//获取session对象
		SqlSession session = sqlsession.openSession();
		//执行sql文件
		User user = new User(2L, "小天", new BigDecimal("1200"), new Date());
		session.insert("cn.onedull.UserMapper.update", user);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testGet() throws Exception {
		//获取配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//获取factory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//获取session对象
		SqlSession session = factory.openSession();
		//执行sql文件
		User user = session.selectOne("cn.onedull.UserMapper.get", 2L);
		System.out.println(user);
		//释放资源
		session.close();
	}
	
	@Test
	public void testGetAll() throws Exception {
		//获取配置文件
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//获取factory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//获取session对象
		SqlSession session = factory.openSession();
		//执行sql文件
		List<User> list = session.selectList("cn.onedull.UserMapper.getall");
		System.out.println(list);
		//释放资源
		session.close();
	}
}
