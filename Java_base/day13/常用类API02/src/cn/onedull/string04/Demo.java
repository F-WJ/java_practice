/*4:已知字符串 String str = "12,334,566547,3132,56,76,312";
  统计字符串中 个位和百位上的值 相加的结果是 10 的数据.
  例如:      129   1456 就满足条件
  
 步骤:
(1)创建字符串对象
(2)利用for和substring方法来筛选出个位和百位的值相加是10 数据

总结:
(1)感觉可以用正则来做
 */
package cn.onedull.string04;

public class Demo {

	public static void main(String[] args) {
		//创建String类型对象
		String str = "12,334,566547,3132,56,76,312, 129";
		//split
		for(String ele : str.split(",")) {
			if(ele.length() >= 3) {
				int sum = Integer.parseInt(ele.substring(ele.length() - 1)) + Integer.parseInt(ele.substring(ele.length() - 3, ele.length() - 2));
				if(sum == 10) {
					System.out.println(ele);
				}
			}
		}
	}

}
