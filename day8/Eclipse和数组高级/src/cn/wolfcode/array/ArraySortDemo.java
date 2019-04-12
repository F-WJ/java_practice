/*
 �������
 
����:
 (1)ÿһλ��,��ȥ�Ա���������Ԫ�ش�С,���ǰһ��Ԫ�ش��ں�һ��Ԫ��,��Ի�������ֵ,ͬ��,�����Ԫ��һ��.���жϵڶ���Ԫ��ʱ,��ѷ�Χ = ��Ԫ��-1 
 
�ܽ�:
(1)�ڿ����������Ҫ��������, ��ʹ�ùٷ���sort����, ���ӷ���
 
 */

package cn.wolfcode.array;

//����Arrays��
import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		int[] arr = new int[]{4, 7, 6, 1};
		//��ӡ����Ԫ��
		System.out.println(Arrays.toString(arr));
		ArraySortDemo.sort(arr);
		//�ٴδ�ӡ
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------");
		int[] arr2 = new int[]{4, 7, 6, 1};
		//�Ż�����
		ArraySortDemo.sort2(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("-------------------");
		int[] arr3 = new int[]{4, 7, 6, 1};
		//�ٷ�����
		ArraySortDemo.sort3(arr3);

	}
	
	
	//���򷽷�(ð��ԭ��)
	static void sort(int[] arr){
		//��һ������
		for(int i = 1; i <= arr.length - 1; i++){
			if(arr[i - 1] > arr[i]){
				ArraySortDemo.swap(arr, i - 1, i);
			}
		}
		
		//�ڶ�������
		for(int i = 1; i <= arr.length - 2; i++){
			if(arr[i - 1] > arr[i]){
				ArraySortDemo.swap(arr, i -1, i);
			}
		}
		
		
		//����������
		for(int i = 1; i <= arr.length - 3; i++){
			if(arr[i - 1] > arr[i]){
				ArraySortDemo.swap(arr, i - 1, i);
			}
		}
	}
	
	
	//�Ż��汾
	static void sort2(int[] arr){
		for(int times = 1; times <= arr.length - 1; times++){
			for(int i = 1; i <= arr.length - times; i++){
				if(arr[i - 1] > arr[i]){
					ArraySortDemo.swap(arr, i - 1, i);
				}
			}
		}
	}
	
	
	//�ٷ��ṩ�ķ���
	static void sort3(int[] arr){
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	//������������Ԫ�ط���
	static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	

}
