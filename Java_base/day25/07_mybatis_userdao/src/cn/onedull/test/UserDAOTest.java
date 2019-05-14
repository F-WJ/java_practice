package cn.onedull.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.onedull.dao.IUserDAO;
import cn.onedull.dao.impl.IUserDAOImpl;
import cn.onedull.domain.User;
/**
 * 
 * 总结：
 * 注意：编写xml文件的时候， 数据库配置信息的名字还有引号之类的
 * 
 * 
 * @author FWJ
 *
 */
public class UserDAOTest {
	private IUserDAO iuser = new IUserDAOImpl();
		
	@Test
	public void testSave() {
		User user = new User(null, "小天", new BigDecimal("3000"), new Date());
		iuser.save(user);
		System.out.println(user.getId());
	}

	@Test
	public void testDelete() {
		iuser.delete(2L);
	}

	@Test
	public void testUpdate() {
		User user = new User(1L, "小亮", new BigDecimal("10000"), new Date());
		iuser.update(user);
	}

	@Test
	public void testGet() {
		User user = iuser.get(1L);
		System.out.println(user);
	}

	@Test
	public void testGetAll() {
		List<User> list = iuser.getAll();
		System.out.println(list);
	}

}
