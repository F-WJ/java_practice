/*
定义一个网络用户类（User），包含用户ID(id)、用户密码（password）、email 地址（emailAdrr）
三个私有化成员变量，
请定义一个含有用户ID(id)、用户密码（password）两个参数的构造器，完成三个实例成
员变量的初始化，其中email 地址（emailAdrr）是用户ID 加上字符串“@gameschool.com”。
请利用上述构造器，在main 方法中实例化网络用户类对象并打印对象信息

步骤:
(1)创建一个User类, 里面有两个私有成员变量id(用户ID)和password(用户密码), 注意email地址, 连接一个邮箱地址字符串
(2)定义一个无参构造器和一个有参构造器
(3)创建测试类UserDemo, 创建User对象
(4)设置值和打印值

总结:
(1)利用setter方法可以修改初始值的内容
 */
package cn.onedull.expand1;

public class UserDemo {

	public static void main(String[] args) {
		//创建对象
		User user = new User(1, "1234");
		//设置值
		user.setEmailAdrr("36459000");
		//打印值
		System.out.println("ID: " + user.getId());
		System.out.println("password: " + user.getPassword());
		System.out.println("email: " + user.getEmailAdrr());
		
		

	}

}
