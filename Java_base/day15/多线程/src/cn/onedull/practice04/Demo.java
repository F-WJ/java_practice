/*
��μ������������������飨û���ظ�Ԫ�أ��Ľ�����
���� a={0,1,2,3,4};b={1,3,5,7,9}; ��ӡ���ظ���Ԫ��1, 3�� 

����:
(1)����Demo��, ����a,b int�������鲢��̬��ʼ��
(2)����forǶ��ѭ��

�ܽ�:
(1)���һ���ظ��Ĳ�����Ҫ��N��, ��ʱ����ʹ��Ƕ��ѭ��

*/
package cn.onedull.practice04;


public class Demo {

	public static void main(String[] args) {
		//��������a , b
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
