/*
����ʹ��StringBuilder ƴ���ַ���

����:
(1)����Demo��, ����StringBuilder��, ����append����

�ܽ�:
(1)ʹ��StringBuilder��, ��ߴ�������Ч��.
*/
package cn.onedull.title07;

public class Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		//����int��������
		int[] arr = new int[100000];
		sb.append("[");
		for(int index = 0; index < arr.length; index++) {
			if(index == arr.length - 1) {
				sb.append(arr[index]).append("]");
			}
			else {
				sb.append(arr[index]).append(", ");
			}
		}
		System.out.println(sb.toString());
	}
	
	//java.lang.OutOfMemoryError
		

}
