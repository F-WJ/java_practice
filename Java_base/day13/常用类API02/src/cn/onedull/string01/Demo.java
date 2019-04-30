/*
1:String str = "刘备;关羽;张飞;曹操;夏侯";
  将str中的人名获得出来,找出其中有几个姓刘的人物
  
步骤:
(1)先定义个String类字符串, 还有一个int类型变量time
(2)利用String类的split方法拆分字符串, 通过for循环加if判断首位索引是否为刘.

总结:
(1)利用String类的split方法, 减少代码量.
*/
package cn.onedull.string01;

public class Demo {

	public static void main(String[] args) {
		//创建String类
		String str = "刘备;关羽;张飞;曹操;夏侯";
		int time = 0;
		//split方法
		String[] str2 = str.split(";");
		for(String ele : str2) {
			if("刘".equals(ele.substring(0, 1))) {
				time++;
			}
		}
		System.out.println(time);
	}

}
