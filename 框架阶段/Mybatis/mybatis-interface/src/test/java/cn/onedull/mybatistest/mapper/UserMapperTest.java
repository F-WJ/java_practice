package cn.onedull.mybatistest.mapper;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.onedull.mybatistest.domain.User;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class UserMapperTest {
	
	
	@Test
	public void testSave() {
		User user = new User(null, "root", "1234");
		SqlSession session = MyBatisUtil.getSession();
		//实现mapper接口
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//调用方法
		userMapper.save(user);
		//提交
		session.commit();
		//释放资源
		session.close();
		//查看id值
		System.out.println(user);
	}
	
	@Test
	public void testUpdate() {
		User user = new User(2L, "admin", "789");
		SqlSession session = MyBatisUtil.getSession();
		//实现mapper接口
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//调用方法
		userMapper.update(user);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testDelete() {
		SqlSession session = MyBatisUtil.getSession();
		//实现mapper接口
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//调用方法
		userMapper.delete(2L);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testGet() {
		SqlSession session = MyBatisUtil.getSession();
		//实现mapper接口
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//调用方法
		List<User> user = userMapper.get(3L);
		//释放资源
		session.close();
		System.out.println(user);
	}
	

}
