/*
���󣺹����ļ�������.avi��β���ļ�

����:
(1)
*/
package cn.onedull.title06;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo06 {

	public static void main(String[] args) {
		//��������
		File f = new File("H:\\Java����\\06IO��\\����\\IO��day01");
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
