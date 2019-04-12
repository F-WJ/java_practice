/*
 ����: ���ַ�����
 
 ���²���:
 �ȶ���һ�������һ������, ����ÿһ�������鷶Χ������������������������ֵ�����һ�����Ƚ��Ѿ�����õı�����ֵ,���жϱ�����ֵ�Ƿ������������
 �������
 (1)������ڱ�����ֵ, ����һ�ε������������,���������Ϊ��һ�ζԱȱ�����ֵ - 1 .
 (2)���С�ڱ�����ֵ,����һ�ε������������,���������Ϊ��һ�ζԱȱ�����ֵ + 1.
 (3)�������,�Ǿ�ȷ����������������������ֵ.
 
 �ܽ�:
 (1)���ַ�����, ���ܷ�������Բ��Ҹ�������.
 */
package cn.wolfcode.array;

//����Arrays��
import java.util.Arrays; 



public class ArraySearchDemo {
	public static void main(String[] args) {
		//��������, ����
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//��һ�����ǻ��ҵ�,�������淽����������
		Arrays.sort(arr);
		int index = ArraySearchDemo.binarySearch(arr, 8);
		System.out.println(index);
		

	}
	
	
	//�жϱ�����ֵ�Ƿ������������ķ���
	static int binarySearch(int[] arr, int key){
		//��ʼ�����ֵΪ0
		int low = 0;
		//��ʼ�����ֵΪ������������
		int high = arr.length - 1;
		
		while(low <= high){
			//���ֵ�����ֵ���м�ֵ
			int mid = (low + high) / 2;
			int midVal = arr[mid];
			
			//�Ƿ����,С��,����keyֵ
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
		return -1; //û��
	}
}
