package cn.onedull._04_reflectstatic;



import java.lang.reflect.Method;

import org.junit.Test;

public class PersonStaticTest {

	@Test
	public void testStatic() throws Exception {
		/*
		 * 步骤：
		 * 1.获取字节码对象 （forName）
		 * 2.获取构造器并创建对象 （getConstructor()）
		 * 3.获取静态方法
		 * 4.获取数组参数方法
		 * 
		 * 总结：
		 * 调用静态方法的时候， 因为不需要对象， invoke（）方法的第一参数为null。
		 * 调用数组参数的时候， 要注意， invoke会自动解包， 需要调用Object类型数组
		 */
		//获取字节码对象
		Class p = Class.forName("cn.onedull._04_reflectstatic.Person");
		//获取构造器并创建对象
		Object obj = p.getConstructor().newInstance();
		//获取静态方法
		Method mm = p.getMethod("method6", String.class);
		mm.invoke(null, "小白");
		//获取数组方法(int数组)
		Method m = p.getMethod("method7", int[].class);
		int[] arr = new int[]{1,2,3,4};
		m.invoke(obj, arr);
		
		//获取数组方法（String类型）
		m = p.getMethod("method8", String[].class);
		String[] arr2 = new String[]{"1", "2", "3"};
		m.invoke(obj, new Object[]{arr2});
		
	}

}
