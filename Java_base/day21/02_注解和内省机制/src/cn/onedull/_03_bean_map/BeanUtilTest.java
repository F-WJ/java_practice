package cn.onedull._03_bean_map;



import java.util.Map;

import org.junit.Test;

public class BeanUtilTest {

	@Test
	public void testBean() throws Exception {
		//创建对象
		Person p = new Person();
		p.setName("小明");
		p.setAge(20);
		Map<String, Object> beanmap = BeanUtil.beanmap(p);
		System.out.println(beanmap);  //{name=小明, age=20}
		
		
		Object mapbean = BeanUtil.mapbean(beanmap);
		System.out.println(mapbean);
		
	}

}
