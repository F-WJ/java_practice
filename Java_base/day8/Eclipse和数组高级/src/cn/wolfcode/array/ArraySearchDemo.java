/*
 需求: 二分法查找
 
 大致步骤:
 先定义一个数组和一个变量, 根据每一次在数组范围内最低索引和最高索引的两个值相除的一半来比较已经定义好的变量的值,来判断变量的值是否存在数组里面
 三个结果
 (1)如果大于变量的值, 则下一次的最低索引不变,最高索引改为上一次对比变量的值 - 1 .
 (2)如果小于变量的值,则下一次的最高索引不变,最低索引改为上一次对比变量的值 + 1.
 (3)如果等于,那就确定数组里面存在这个变量的值.
 
 总结:
 (1)二分法搜索, 性能方面比线性查找更加优异.
 */
package cn.wolfcode.array;

//导入Arrays包
import java.util.Arrays; 



public class ArraySearchDemo {
	public static void main(String[] args) {
		//定义数组, 变量
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//万一数组是混乱的,利用下面方法重新排序
		Arrays.sort(arr);
		int index = ArraySearchDemo.binarySearch(arr, 8);
		System.out.println(index);
		

	}
	
	
	//判断变量的值是否存在数组里面的方法
	static int binarySearch(int[] arr, int key){
		//初始化最低值为0
		int low = 0;
		//初始化最高值为数组的最高索引
		int high = arr.length - 1;
		
		while(low <= high){
			//最低值和最高值的中间值
			int mid = (low + high) / 2;
			int midVal = arr[mid];
			
			//是否大于,小于,等于key值
			if(midVal < key){
				low = mid + 1;
			}
			else if(midVal > key){
				high = mid - 1;
			}
			else{
				return mid;
			}
			
		}
		return -1; //没有
	}
}
