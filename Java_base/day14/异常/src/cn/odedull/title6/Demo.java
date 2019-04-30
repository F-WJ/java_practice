/*
需求：自定义异常LogicException，使用自定义异常模仿用户注册功能


步骤:
(1)自定义一个LogicException异常类,  继承RuntimeException.
(2)自定义一个LoginException2异常类, 继承Exception
(3)定义测试类Demo, 定义一个String字符串和数组,  模拟用户注册和注册名单
(4)通过for循环和if语句判断, 注册账号是否存在, 如果存在的话,  抛出异常.

总结:
(1)自定义异常类, 通常是继承RuntimeException, 和定义一个带参数的构造器, 并调用父类构造器,,
	用来反馈错误信息
*/
package cn.odedull.title6;

public class Demo {

	public static void main(String[] args) throws LogicException{
		//模拟用户注册
		String str = "阿鸭";
		//模拟数据库已注册账号
		String[] strName = new String[]{"阿鸡", "阿鸭", "阿狗"};
		
		for(String ele : strName) {
			if(ele.equals(str)) {
				throw new LogicException("账号名已存在");
			}
		}
	}

}
