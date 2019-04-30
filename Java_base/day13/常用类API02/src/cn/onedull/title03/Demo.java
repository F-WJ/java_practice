/*
需求：
使用随机数UUID 类，通过UUID 类获取随机数
通过UUID 类，获取验证码

步骤:
(1)调用UUID类的randomUUID方法

总结:
(1)可以来做验证码使用
*/
package cn.onedull.title03;

import java.util.UUID;

public class Demo {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString().substring(0, 4);
		System.out.println(uuid);
	}

}
