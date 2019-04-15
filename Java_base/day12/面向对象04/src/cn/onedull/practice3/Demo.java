/*
定义一个网络用户类(User)，包含用户id(id)、用户名(username)用户密码(password)、
email 地址(emailAdrr)四个私有化成员变量和一个属于类的用户总人数(totalUser)，
(1)请定义一个含有用户id(id)、用户名(username)用户密码(password)三个参数的构
造器，完成四个实例成员变量的初始化，其中email 地址(emailAdrr)是用户名加上字符串
“@gameschool.com”。
(2)请利用上述构造器，在main 方法中实例化网络用户类对象，每创建一个对象，用户
总人数(totalUser)加一，创建三个实例，最后打印用户总人数。

步骤:
(1)创建一个user类, 创建三个private修饰的成员变量用户id(id), username(户名), pasword(用户密码),
	还有一个static修饰的成员变量totalUser
(2)创建测试类Demo, 创建三个Usre对象, 打印用户总数totalUser的值 


总结:
(1)成员变一旦使用了static修饰符, 它的值被所有对象共享, 一旦修改, 相互影响
*/
package cn.onedull.practice3;

public class Demo {
	public static void main(String[] args) {
		//创建对象
		User user1 = new User(1, "小屁", "1234325" );
		user1.setEmail("1234567");
		User user2 = new User(1, "小峰", "12343235" );
		user1.setEmail("1234567233");
		User user3 = new User(1, "小狗", "1234532" );
		user1.setEmail("1234567343");
		int sum = User.totalUser;
		//打印totalUser值
		System.out.println(sum);
	}
		
}
