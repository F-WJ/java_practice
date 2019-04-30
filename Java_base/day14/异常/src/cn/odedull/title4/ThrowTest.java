/*
需求：演示返回异常throw 的使用


步骤:
(1)定义一个setAge方法,  利用if判断, 如果传入年龄低于18的话, 抛出异常
(2)在main方法里面设置try-catch异常

总结:
(1)throw作用是, 方法里面出现的异常, 但不想处理这个异常, 直接利用throw抛出给调用者
*/
package cn.odedull.title4;

public class ThrowTest {

	public static void main(String[] args){
		int age = 50;
		try {
			setAge(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void setAge(int age) throws Exception{
		if(age < 18) {
			throw new Exception("不能低于18");
		}
	}

}
