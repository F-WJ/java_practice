/*
3:String[] arr = {"name","age","price"}
 ���ַ�����ÿ�����ʵ�����ĸ��д,����Сд,Ȼ���滻��ԭ����
 
����:
(1)����String����arr
(2)����for��substring, toUpperCase, toLowerCase�����ַ�������ĸ��д, ����Сд
(3)��ӡ����

�ܽ�:
(1)����toUpperCase��toLowerCase�������Խ���ĸ��Сд
*/
package cn.onedull.string03;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		//�����ַ���
		String[] arr = {"name","age","price"};
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
		}
		//��ӡ
		System.out.println(Arrays.toString(arr));
	}

}
