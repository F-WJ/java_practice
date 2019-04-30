/*
已知java 学院教课内容安排如下
老师课程
stef p2p
will javaWeb
neld springmvc
hesj wms
bunny javaWeb
hhaiy javaSe


要求：
1：使用Map， 以老师名字为key 课程名为value， 完成课程安排
2：添加一个新老师dafei 教jdbc
3：hhaiy 改为教javaWeb
4：输出所有老师，以及老师教授课程
5：查出所有教javaWeb 的老师

步骤:
(1)创建HashMap对象
(2)调用put方法添加数据
(3)调用replace修改某一key对应的value
(4)调用entrySet方法和for方法遍历数据

总结:
(1)修改某一key对应的值, 可以使用replace, 不用在前面写判断是否存在
*/
package cn.onedull.practice05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		//创建Map对象
		HashMap<String, String> map = new HashMap<String, String>();
		//添加数据
		map.put("stef", "p2p");
		map.put("will", "javaWeb");
		map.put("neld", "springmvc");
		map.put("hesj", "wms");
		map.put("bunny", "javaWeb");
		map.put("hhaiy", "javaSe");
		
		map.put("defei", "jdbc");
		
		//修改
		//if(map.containsKey("hhaiy")) {
		map.replace("hhaiy", "javaWeb");
		//}
		
		//输出所有老师课程信息
		Set<Entry<String, String>> all = map.entrySet();
		Iterator<Entry<String, String>> it = all.iterator();
		while(it.hasNext()) {
			Entry<String, String> e = it.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("----------------------------");
		//查出所有教javaWeb的老师
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry<String, String> ele : entry) {
		
			if("javaWeb".equals(ele.getValue())) {
				System.out.println(ele.getKey());
			}
			
		}
	}

}
