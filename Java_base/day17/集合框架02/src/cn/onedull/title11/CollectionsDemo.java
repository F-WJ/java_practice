/*
需求：调用Arrays 和Collections 工具类中的常用方法
asList 方法

步骤:
(1)使Arrays类的asList

总结:
(1)通过aslist方法装换的list, 不支持remove和add方法
*/
package cn.onedull.title11;

import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		String[] arr = new String[]{"小月", "小凤" ,"小天"};
		List<String> list = Arrays.asList(arr);
		list.add("xiao ");
	}

}
