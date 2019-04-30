/*
需求：File类案例-使用递归列出指定目录中所有的子文件

总结:
(1)
*/
package cn.onedull.title04;

import java.io.File;
import java.util.Arrays;

public class FileDemo4 {

	public static void main(String[] args) {
		//创建一个File对象
		File f = new File("H:\\Java资料\\06IO流");
		File[] f2 = f.listFiles();
		file(f2);
		
		
		
		
	}

	public static void file(File[] f2) {
		for(File ele : f2) {
			if(ele.isDirectory()) {
				file(ele.listFiles());
			}
			System.out.println(ele);
		}
	}
}


	