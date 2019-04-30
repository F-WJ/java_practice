/*
 * ���󣺶���һ������transfer(int[] arr, int index1, int index2)ʵ�ֽ�������arr ������Ϊindex1
 * ��index2 ��ӦԪ�ص�ֵ��
 * ����:
 * (1)����һ��transfer����, ����Ϊһ��int�����������������
 * (2)����������Ϊ��������Ԫ�ضԻ�����
 * (3)���÷���
 * 
 * �ܽ�:
 * (1)���齻��Ԫ��, ������������ĳһ������ֵ
 */
package cn.wolfcode.array;

import java.util.Arrays;

public class ChangeDemo {
	public static void main(String[] args)
	{
		//����int�������鲢��ʼ��]
		int[] arr = new int[]{1, 2, 3, 4};
		//���÷���
		ChangeDemo.transfer(arr, 0, 3);
		//��ӡ
		System.out.println(Arrays.toString(arr));
			
		
	}

	static void transfer(int[] arr, int i, int j) {
		//����
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
}
