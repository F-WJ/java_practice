/*
需求：过滤文件夹中以.avi结尾的文件

步骤:
(1)
*/
package cn.onedull.title06;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo06 {

	public static void main(String[] args) {
		//创建对象
		File f = new File("H:\\Java资料\\06IO流\\代码\\IO流day01");
		File[] f1  = f.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith("avi")){
					return false;
				}
				return true;
			}
		});
		
		for(File ele : f1) {
			System.out.println(ele);
		}
		
	}

}
