package cn.onedull.mybatistest.mapper;



import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.onedull.mybatistest.domain.User;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class UserMapperTest {
	
	
	@Test
	public void testSave() {
		User user = new User(null, "admin", "1234");
		SqlSession session = MyBatisUtil.getSession();
		session.insert("cn.onedull.mybatistest.mapper.UserMapper.save", user);
		//提交
		session.commit();
		//释放资源
		session.close();
		//查看id值
		System.out.println(user);
	}
	
	@Test
	public void testUpdate() {
		User user = new User(2L, "admin", "1234789");
		SqlSession session = MyBatisUtil.getSession();
		session.insert("cn.onedull.mybatistest.mapper.UserMapper.update", user);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testDelete() {
		SqlSession session = MyBatisUtil.getSession();
		session.insert("cn.onedull.mybatistest.mapper.UserMapper.delete", 4L);
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testGet() {
		SqlSession session = MyBatisUtil.getSession();
		User user = session.selectOne("cn.onedull.mybatistest.mapper.UserMapper.get", 2L);
		//释放资源
		session.close();
		System.out.println(user);
	}
	

}
