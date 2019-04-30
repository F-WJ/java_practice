/*
需求：演示File类分隔符

总结:
(1)注意在window上的分隔符使用\\, 而在苹果电脑和linux上使用/
*/
package cn.onedull.title01;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		File f = new File("H:\\Java资料\\06IO流");
	}

}
