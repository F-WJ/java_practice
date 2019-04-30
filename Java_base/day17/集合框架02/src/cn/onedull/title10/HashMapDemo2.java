/*
需求：统计一个字符串中每个字符出现次数

步骤:
(1)先创建HashMap对象
(2)利用for循环和HashMap的containsKey方法来判断集合是否存在某一数据, 如果存在就添加

总结:
(1)可以利用HashMap的containsKey来做判断是否有重复数据的操作
*/
package cn.onedull.title10;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		//创建HashMap对象
		HashMap<Character,Integer> map = new HashMap<>();
		
		String text = "明天有雨,带雨伞也没用那种";
		//for循环
		for(int i = 0 ; i<text.length();i++){
			char c = text.charAt(i);
			if(map.containsKey(c)){
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			}else{
				map.put(c, 1);
			}
			
		}
		//打印
		System.out.println(map);
	}

}
