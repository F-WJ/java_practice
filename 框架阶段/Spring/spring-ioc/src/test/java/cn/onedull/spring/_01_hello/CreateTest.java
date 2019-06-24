package cn.onedull.spring._01_hello;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.onedull.spring._02_ioc.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CreateTest {

	@Autowired
	private Person person;
	
	@Test
	public void testPerson2() throws Exception {
		person.doWork();
	}
	
	@Test
	public void testPerson1() {
		//加载配置文件
		Resource resource = new ClassPathResource("applicationContext.xml");
		//解析配置文件
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//三种获取对象方法
		//第一个通过名字
		Person person = (Person)beanFactory.getBean("person");
		//第二个通过类型
		Person person2 = beanFactory.getBean(Person.class);
		//第三个通过名字和类型
		Person person3 = beanFactory.getBean("person", Person.class);
		person.doWork();
		person2.doWork();
		person3.doWork();
	}



}
