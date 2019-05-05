package cn.onedull._03_bean_map;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class BeanUtil {
	
	public static Object mapbean(Map<String, Object> map) throws Exception{
		/*
		 * 步骤：
		 * 1.创建对象（通过反射）
		 * 1.获取描述对象
		 * 2.获取属性的描述信息
		 * 3.获取map的value值
		 * 4.获取set方法
		 * 5.调用invoke方法，存放value值 
		 * 
		 * 
		 * 总结：
		 * map和javabean转换， 两个差别主要在于最后一步操作， 一个是读， 一个是写， 前面的获取描述
		 * 对象， 获取属性的描述信息都是一样的。
		 */
		//创建对象
		Person p = Person.class.newInstance();
		//获取描述对象
		BeanInfo bo = Introspector.getBeanInfo(p.getClass(), Object.class);
		//获取属性的描述信息
		PropertyDescriptor[] pds = bo.getPropertyDescriptors();
		//循环
		for (PropertyDescriptor pd : pds) {
			String key = pd.getName();
			//获取map的key对应的value值
			Object obj = map.get(key);
			//获取set方法
			Method wd = pd.getWriteMethod();
			wd.invoke(p, obj);
			
		}
		return p;
		
	}
	
	
	
	public static Map<String, Object> beanmap(Object obj) throws Exception{
		/*
		 * 步骤
		 * 1.获取描述对象(Introspector)
		 * 2.获取属性的描述信息 (getPropertyDescriptors)
		 * 3.获取属性名， 当成是Map的key值 (getName)
		 * 4.获取get方法， 当成是Map的value值（getReadMethod）
		 */
		//创建HashMap
		Map<String, Object> map = new HashMap<String, Object>();
		//获取描述对象
		BeanInfo bo = Introspector.getBeanInfo(obj.getClass(), Object.class);
		//获取属性的描述信息
		PropertyDescriptor[] pds = bo.getPropertyDescriptors();
		//循环
		for (PropertyDescriptor pd : pds) {
			String key = pd.getName(); //map的key值
			// 获取get方法的属性
			Method rd = pd.getReadMethod();
			Object value = rd.invoke(obj);
			//System.out.println(value);\
			//存放到Map上
			map.put(key, value);
			
		}
		return map;
		
	}
}
