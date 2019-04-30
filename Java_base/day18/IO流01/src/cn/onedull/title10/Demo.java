/*
1、请根据以下描述完成操作。
1）请用IO的知识点，获取文件的内容。文件内容如下：
 
2）创建一个Map集合将统计文件D:/calcCharNum.txt中各个字母出现次数	。
3）遍历Map集合并按照以下格式打印，格式如下：“A(2),B(5),C(4),D(6),E(3),F(7)”，括号内代表字符出现次数。

 */
package cn.onedull.title10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) throws IOException {
		//创建对象
		Reader reader = new FileReader("calcCharNum.txt");
		//输入内容
		char[] c = new char[1024*8];
		String str = "";
		int len;
		while((len = reader.read(c)) != -1) {
			//int len = reader.read(c);
			str = new String(c, 0, len);
			System.out.println(str);
		}
		//关闭	
		reader.close();
		
		//遍历Map集合并按照以下格式打印，格式如下：“A(2),B(5),C(4),D(6),E(3),F(7)”
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		
		//遍历
		StringBuilder str1 = new StringBuilder();
		str1.append("\"");
		Set<Entry<Character, Integer>> entry = map.entrySet();
		for(Entry<Character, Integer> ele : entry) {
			str1.append(ele.getKey() + "(" + ele.getValue() + ")" + ",");
		}
		str1.replace(str1.length() - 1, str1.length() , "");
		str1.append("\"");
		
		System.out.println(str1);
		Iterator<Entry<Character, Integer>> it = entry.iterator();
		while(it.hasNext()) {
			Entry<Character, Integer>  e = it.next();
			if(e.getKey() == 'A') {
				//it.remove();
			}
		}
		
		
		String str33 = "aAak";
		//取巧
		System.out.println(str33.replaceAll("[a-z]", "").length());
		System.out.println(str33.replaceAll("[A-Z]", "").length());
		System.out.println(map);
	}

}
