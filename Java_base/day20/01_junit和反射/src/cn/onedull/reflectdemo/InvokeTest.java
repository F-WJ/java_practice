package cn.onedull.reflectdemo;



import java.lang.reflect.Method;

import org.junit.Test;
/**
 * 需求
 *1)执行无参无返回的方法
 *2)执行有参无返回的方法
 *3)执行无参有返回的方法
 *4)执行有参有返回的方法
 *5)执行私有方法
 *
 *总结:
 *注意执行私有方法时, 必须调用setAccessible方法, 才能调用私有方法, 不然没有访问权限, 导致程序报错
 *
 * @author FWJ
 *
 */
public class InvokeTest {

	@Test
	public void testInvoke() throws Exception {
		//
		Class c = Class.forName("cn.onedull.reflectdemo.Person");
		//创建对象
		Object obj = c.newInstance();
		
		//执行无参无返回的方法
		//获取方法
		Method m = c.getMethod("method1");
		//调用方法
		Object ie = m.invoke(obj);
//		System.out.println(ie);
		
		//执行有参无返回的方法
		//获取方法
		m = c.getMethod("method2", String.class);
		//调用方法
		ie = m.invoke(obj, "小明");
		System.out.println(ie);
		
		//执行无参有返回的方法
		//获取方法
		m = c.getMethod("method3");
		//调用方法
		ie = m.invoke(obj);
		
		//执行有参有返回的方法
		m = c.getMethod("method4", String.class);
		//调用方法
		ie = m.invoke(obj, "小乔");
		System.out.println(ie);
		
		//执行私有方法
		m = c.getDeclaredMethod("method5");
		m.setAccessible(true);
		ie = m.invoke(obj);
		
		//调用静态方法
		m = c.getMethod("method6", String.class);
		ie = m.invoke(null, "小明");
		System.out.println(ie);
		
		//调用基本类型数组
		int[] arr = new int[]{1,2,3,4};
		m = c.getMethod("method7", int[].class);
		ie = m.invoke(obj, arr);
		
		//调用引用类型数组
		String[] arr2 = new String[]{"1", "2", "3"};
		m = c.getMethod("method8", String[].class);
		//ie = m.invoke(obj, arr2);
		ie = m.invoke(obj, new Object[]{arr2});
		
	}

}
