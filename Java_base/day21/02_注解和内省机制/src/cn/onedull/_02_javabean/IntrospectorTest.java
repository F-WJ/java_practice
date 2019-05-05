package cn.onedull._02_javabean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

public class IntrospectorTest {

	@Test
	public void testIntrospector() throws Exception {
		/**
		 * 步骤：
		 * 1.获取javabean的描述对象（Introspector）
		 * 2.获取属性的描述信息（getProperyDecriptors）
		 * 3.通过for循环
		 * 4.获取属性名（getName）
		 * 5.获取属性类型（getPropertyType）
		 * 6.获取get方法（getReadMethod）
		 * 7.获取set方法（getWriteMethod）
		 * 
		 * 总结：
		 * 使用专属操作javabean的操作API， 比通过反射来操作javabean中的属性更加方便。
		 */
		//获取描述对象
		BeanInfo bo = Introspector.getBeanInfo(Person.class, Object.class);
		//获取属性的描述信息
		PropertyDescriptor[] pds = bo.getPropertyDescriptors();
		//循环
		for (PropertyDescriptor pd : pds) {
			//获取属性名
			String name = pd.getName();
			System.out.println(name);
			//获取属性类型
			Class propertyType = pd.getPropertyType();
			System.out.println(propertyType);
			//获取get方法
			Method readMethod = pd.getReadMethod();
			System.out.println(readMethod);
			//获取set方法
			Method writeMethod = pd.getWriteMethod();
			System.out.println(writeMethod);
			System.out.println("----------------------");
		}
	}

}
