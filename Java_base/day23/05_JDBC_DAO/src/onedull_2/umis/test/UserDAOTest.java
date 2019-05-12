package onedull_2.umis.test;

import java.util.List;

import org.junit.Test;

import onedull_2.umis.dao.IUserDAO;
import onedull_2.umis.dao.impl.UserDAOImpl;
import onedull_2.umis.domain.User;



public class UserDAOTest {
	private IUserDAO u = new UserDAOImpl();
	@Test
	public void testSave() {
		//创建对象
		User user = new User(1, "小光", 19);
		u.save(user);
		
	}

	@Test
	public void testDelete() {
		u.delete(11L);
	}

	@Test
	public void testUpdate() {
		User user = new User(13, "小天", 30);
		u.update(user);	
	}

	@Test
	public void testGet() {
		User user = new User();
		List<User> list = u.get(user, null);
		System.out.println(list);
	}

}
