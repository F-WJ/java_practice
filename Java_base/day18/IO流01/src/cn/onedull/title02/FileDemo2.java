/*
需求：演示File类中方法-获取File路径和检测状态


总结:
(1)
*/
package cn.onedull.title02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("H:\\Java资料\\06IO流");
		//判断文件是否存在
		boolean rel = f.exists();
		System.out.println(rel);
		//获取绝对路径
		String str = f.getAbsolutePath();
		System.out.println(str);
		//获取当前文件名
		String str2 = f.getName();
		System.out.println(str2);
		//获取文件路径(String类型), 比getAbsolutePath方法简短
		String str3 = f.getPath();
		System.out.println(str3);
		//返回当前路径上一级
		String str4 = f.getParent();
		System.out.println(str4);
		//判断路径是否是绝对路径
		boolean b = f.isAbsolute();
		System.out.println(b);
		File f2 = new File("q.txt");
		System.out.println(f2.isAbsolute());
		//测试为普通文件
		System.out.println(f.isFile());
		System.out.println(f2.isFile());
		
		
		
		
		
	}

}
