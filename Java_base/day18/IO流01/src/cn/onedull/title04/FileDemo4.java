/*
����File�స��-ʹ�õݹ��г�ָ��Ŀ¼�����е����ļ�

�ܽ�:
(1)
*/
package cn.onedull.title04;

import java.io.File;
import java.util.Arrays;

public class FileDemo4 {

	public static void main(String[] args) {
		//����һ��File����
		File f = new File("H:\\Java����\\06IO��");
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


	