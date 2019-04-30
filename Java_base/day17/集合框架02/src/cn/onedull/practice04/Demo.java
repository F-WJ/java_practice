/*
1) 创建一个List，在List 中增加三个工人，基本信息如下：
姓名年龄工资
zhang3 18 3000
li4 25 3500
wang5 22 3200
2) 在li4 之前插入一个工人，信息为：
姓名：zhao6，年龄：24，工资3300
3) 删除wang5 的信息
4) 利用for 循环遍历，打印List 中所有工人的信息
5) 利用迭代遍历，对List 中所有的工人调用work 方法。
6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true

步骤:
(1)定义Worker类, 成员变量姓名name(String类型), 年龄age(int类型), 工资salary(double)
	成员方法work(), 覆盖equals()
(2)定义测试类Demo, 创建ArrayList对象
(3)调用add方法添加Worker对象
(4)运行, 查看结果

总结:
(1)通过equals方法覆盖

*/
package cn.onedull.practice04;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<Worker> list = new ArrayList<Worker>();
		//添加Worker对象
		list.add(new Worker("zhang3", 18, 3000));
		list.add(new Worker("zhang3", 18, 3000));  //测试
		list.add(new Worker("li4", 25, 3500));
		list.add(new Worker("wang5", 22, 3200));
		
		
		//在li4 之前插入一个工人
		int size = 0;
		for(Worker worker : list ) {
			if("li4".equals(worker.getName())){
				
				size = list.indexOf(worker);
				break;
			}
		}
		list.add(size + 1, new Worker("zhao6", 24, 300));
		
		//for循环
		for(Worker ele : list) {
			System.out.println(ele);
		}
		
		//迭代遍历
		Iterator<Worker> it = list.iterator();
		while(it.hasNext()) {
			it.next().work();;
		}
		
		//打印
		System.out.println(list);
	}

}
