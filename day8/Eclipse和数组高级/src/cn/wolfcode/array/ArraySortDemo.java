/*
 排序操作
 
步骤:
 (1)每一位数,都去对比数组其他元素大小,如果前一个元素大于后一个元素,请对换两个的值,同理,后面的元素一样.当判断第二个元素时,请把范围 = 总元素-1 
 
总结:
(1)在开发中如果需要数组排序, 请使用官方的sort方法, 更加方便
 
 */

package cn.wolfcode.array;

//导入Arrays包
import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		int[] arr = new int[]{4, 7, 6, 1};
		//打印数组元素
		System.out.println(Arrays.toString(arr));
		ArraySortDemo.sort(arr);
		//再次打印
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------");
		int[] arr2 = new int[]{4, 7, 6, 1};
		//优化代码
		ArraySortDemo.sort2(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("-------------------");
		int[] arr3 = new int[]{4, 7, 6, 1};
		//官方方法
		ArraySortDemo.sort3(arr3);

	}
	
	
	//排序方法(冒泡原理)
	static void sort(int[] arr){
		//第一次排序
		for(int i = 1; i <= arr.length - 1; i++){
			if(arr[i - 1] > arr[i]){
				ArraySortDemo.swap(arr, i - 1, i);
			}
		}
		
		//第二次排序
		for(int i = 1; i <= arr.length - 2; i++){
			if(arr[i - 1] > arr[i]){
				ArraySortDemo.swap(arr, i -1, i);
			}
		}
		
		
		//第三次排序
		for(int i = 1; i <= arr.length - 3; i++){
			if(arr[i - 1] > arr[i]){
				ArraySortDemo.swap(arr, i - 1, i);
			}
		}
	}
	
	
	//优化版本
	static void sort2(int[] arr){
		for(int times = 1; times <= arr.length - 1; times++){
			for(int i = 1; i <= arr.length - times; i++){
				if(arr[i - 1] > arr[i]){
					ArraySortDemo.swap(arr, i - 1, i);
				}
			}
		}
	}
	
	
	//官方提供的方法
	static void sort3(int[] arr){
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	//交换数字两个元素方法
	static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	

}
