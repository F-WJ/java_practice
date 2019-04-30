/*
如何计算两个有序整型数组（没有重复元素）的交集？
例如 a={0,1,2,3,4};b={1,3,5,7,9}; 打印出重复的元素1, 3。 

步骤:
(1)创建Demo类, 定义a,b int类型数组并静态初始化
(2)利用for嵌套循环

总结:
(1)如果一个重复的操作需要做N次, 此时可以使用嵌套循环

*/
package cn.onedull.practice04;


public class Demo {

	public static void main(String[] args) {
		//定义数组a , b
		int[] a = {0,1,2,3,4};
		int[] b = {1,4,5,12,9,12};
		for(int x = 0; x < a.length; x++) {
			int count = 0;
			for(int y = 0; y < b.length; y++) {
				if(a[x] == b[y]) {
					count = 1;
					break;
				}
			}
			if(count == 0) {
				System.out.println(a[x]);
			}
		}
		
	}

}
