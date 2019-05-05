package cn.onedull.reflectdemo;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;
/**
 *需求1:
 *1)获取所有public构造器
 *2)获取所有构造器包括private
 *3)获取无参数public构造器
 *4)获取带有指定参数的public构造器
 *5)获取带有指定参数的private构造器
 *需求2:
 *1)调用空参构造
 *2)获取带参数构造并创建对象
 *3)获取私有构造并创建对象
 *
 *总结:
 *在创建private修饰的构造器时, 使用 void setAccessible(boolean flag) , 设置为true, 表示可以访问, 不管权限问题
 *
 * @author FWJ
 *
 */
public class ConstructorTest {

	@Test
	public void testConstructor() throws Exception {
		
		//获得字节码对象
		Class con = Class.forName("cn.onedull.reflectdemo.Person");
		//在类中获取
		Class con2 = Person.class;
		
		//获取所有public构造器
		Constructor[] cs = con.getConstructors();
		for(Constructor ele :cs){
//			System.out.println(ele);
		}
		
		//获取所有构造器包含private
		Constructor[] ds = con.getDeclaredConstructors();
		for(Constructor e : ds){
//			System.out.println(e);
		}
			
		//获取无参数public构造器
		Constructor c = con.getConstructor();
		System.out.println(c);
		
		//获取带有指定参数的public构造器
		Constructor cr = con.getConstructor(String.class, int.class);
		System.out.println(cr);
		
		//获取带有指定参数的private构造器
		cr = con.getDeclaredConstructor(String.class);
		System.out.println(cr);
		
		
		//获取带参数构造器并创建对象
		//获取带参数构造器
		Constructor c1 = con.getConstructor(String.class, int.class);
		//创建对象
		Object obj = c1.newInstance("小明", 18);
		System.out.println(obj);  // Person [name=小明, age=18]
		
		//获取私有构造器并创建对象
		//获取私有构造器
		Constructor c2 = con.getDeclaredConstructor(String.class);
		//创建对象
		//权限设置
		c2.setAccessible(true);
		obj = c2.newInstance("小马");
		System.out.println(obj);  // Person [name=小马, age=0]

	}
	
	

}
