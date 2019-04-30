package cn.onedull.practice2;

public class Print implements ILowercaseLetter, IUppercaseLetter{
	//小写
	public void printLowercaseLetter(String str) {
		str = str.toLowerCase();
		System.out.println(str);
	}
	
	//大写
	public void printUppercaseLetter(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}
}


/*
 * 2)要求覆盖printUppercaseLetter()方法实现为：将成员变量str 转换并打印为全大写英文字母
 * 的功能，覆盖printLowercaseLetter()方法实现为：
 * 将成员变量str 转换并打印为全小写英文字 母的功能。 【提示：（码表65
 * 为A，码表97 为a）】
 */