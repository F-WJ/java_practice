package cn.onedull.umis.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.onedull.umis.domain.User;
import cn.onedull.umis.service.IUserService;
import cn.onedull.umis.service.impl.UserServiceImpl;
import cn.onedull.umis.util.StrUtil;

public class UserServiceTest {
	IUserService service = new UserServiceImpl();
	
	@Test
	public void testSave() {
		User user = new User(null, "晓东", new BigDecimal("3000"), new Date());
		service.save(user);
	}

	@Test
	public void testDelete() {
		service.delete(3L);
	}

	@Test
	public void testUpdate() {
		User user = new User(2L, "小张", new BigDecimal("3000"), new Date());
		service.update(user);
	}

	@Test
	public void testGet() {
		User user = service.get(2L);
		System.out.println(user);
	}

	@Test
	public void testGetAll() {
		List<User> list = service.getAll();
		System.out.println(list);
	}
	
	
	@Test
	public void testStrUtil() throws Exception {
		String str = null;
		boolean hasLength = StrUtil.hasLength(str);
		System.out.println(hasLength);
	}

}
