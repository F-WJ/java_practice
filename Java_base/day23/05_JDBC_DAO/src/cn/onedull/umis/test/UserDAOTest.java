package cn.onedull.umis.test;

import java.util.List;

import org.junit.Test;

import cn.onedull.umis.dao.IUserDAO;
import cn.onedull.umis.dao.impl.UserDAOImpl;
import cn.onedull.umis.domain.User;

public class UserDAOTest {

	@Test
	public void testSave() {
		//创建对象
		User user = new User(null, "小光", 19);
		IUserDAO u = new UserDAOImpl();
		u.save(user);
		
	}

	@Test
	public void testDelete() {
		IUserDAO u = new UserDAOImpl();
		u.delete(1L);
	}

	@Test
	public void testUpdate() {
		User user = new User(null, "小天", 20);
		IUserDAO u = new UserDAOImpl();
		u.update(user);	
	}

	@Test
	public void testGet() {
		IUserDAO u = new UserDAOImpl();
		User user = new User();
		List<User> list = u.get();
		System.out.println(list);
	}

}
