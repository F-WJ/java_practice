/*
����ʹ��static �����ķ�ʽ����һ������Ĺ����࣬������

����:
(1)���������鹤����Arrayutil, ������˽�л�, ����һ��������̬����toString
(2)����������Demo, ��main������ֱ�����������÷���

�ܽ�:
(1)ʹ��static���κ󷽷�, ����ֱ��ʹ����������
*/
package cn.onedull.title01;

public class Demo {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4};
		//ֱ��ͨ���������÷���
		String str = ArrayUtil.toString(arr);
		System.out.println(str);
	}	
}
