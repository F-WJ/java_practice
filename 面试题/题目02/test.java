/*
题目：
现再有一字符串*abc**gfe***xyz*，
请写一个方法，将*号移到首部，
并不改变其他字母的顺序，即结果为 *******abcgfexyz

思路：
使用String里的toCharArray方法，将字符串转换成数组
*/

public class test{
    public static void main(String[] args) {
        String str = "*abc**gfe***xyz*";
		char[] a = str.toCharArray();
		String newstr = "";
		System.out.println(newstr);
		for(char ele : a)
		{
			if(ele == '*')
			{
				newstr = newstr + ele;
			}
		}
		for(char ele : a)
		{
			if(ele != '*')
				{
				newstr = newstr + ele;
			}
		}
		System.out.println(newstr);

    }
}
