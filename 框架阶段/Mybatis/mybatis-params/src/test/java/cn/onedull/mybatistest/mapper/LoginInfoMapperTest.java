package cn.onedull.mybatistest.mapper;



import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.onedull.mybatistest.domain.LoginInfo;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class LoginInfoMapperTest {
	
	@Test
	public void testGet() {
		SqlSession session = MyBatisUtil.getSession();
		//实现mapper接口
		LoginInfoMapper userMapper = session.getMapper(LoginInfoMapper.class);
		//调用方法
		//LoginInfo loginInfo = new LoginInfo(null, "root", "1234");
		//List<LoginInfo> user = userMapper.get(loginInfo);
		List<LoginInfo> user = userMapper.get("root", "1234");
		//释放资源
		session.close();
		System.out.println(user);
	}

	
	

}
