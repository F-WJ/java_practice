package cn.onedull.reflectdemo;



import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;
/**
 * 需求
 *1)获取所有public方法,包括继承的
 *2)获取所有方法,包括private,不包括继承的
 *3)获取指定方法,包括继承的
 *4)获取指定方法,包括private,不包括继承的
 *
 *总结:
 *注意在获取指定方法的时候, 如果存在参数, 注意参数的类型和个数,位置
 *
 *
 *
 * * @author FWJ
 *
 */
public class MethodTest {

	@Test
	public void testMethod() throws Exception {
		//创建字节码对象
		Class c = Class.forName("cn.onedull.reflectdemo.Person");
		//获取所有public方法
		Method[] ms = c.getMethods();
		for(Method m : ms){
//			System.out.println(m);
		}
		
		//获取所有方法, 包含private
		ms = c.getDeclaredMethods();
		for(Method m : ms){
//			System.out.println(m);
		}
		
		//获取指定方法
		Method m = c.getMethod("method3");
		System.out.println(m); 
		
		//获取指定方法, 包含private修饰的
		m = c.getDeclaredMethod("method5");
		System.out.println(m); 
		
	
		
	}
	
	

}
