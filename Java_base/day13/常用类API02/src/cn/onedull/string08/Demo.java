/*
String str = "sfsdf算法发 所发生的非爱爱爱 aficionado哇爱" 统计字符串中 爱出现了几次
使用 repalce方法比较灵活
  
思路:
(1)运用if + charAt方法来判断
*/
package cn.onedull.string08;

public class Demo {

	public static void main(String[] args) {
		String str = "sfsdf算法发 所发生的非爱爱爱    aficionado哇爱";
		int sum = 0;  //总数
		//for
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '爱') {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
