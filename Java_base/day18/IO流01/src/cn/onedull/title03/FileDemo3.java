/*
需求：演示File类中的文件操作方法

(1)
步骤:
总结:
(1)length方法返回当前目录下所有文件和目录( 如果抽象路径不是文件夹, 返回null)
*/
package cn.onedull.title03;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo3 {

	public static void main(String[] args) {
		//创建File对象
		File f = new File("H:\\Java资料\\06IO流");
		File f2 = new File("q.txt");
		//返回文件内容的长度( 如果是txt文件, 返回内容总字节 )
		System.out.println(f.length());
		System.out.println(f2.length());
		//返回当前目录下所有文件和目录( 如果抽象路径不是文件夹, 返回null)
		String[] str = f2.list();
		System.out.println(Arrays.deepToString(str));
		f.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return false;
			};
		
		});
		
		
	}

}
