/*
String[] strs = {"2+3+4","2+4","5+6","9+7"};
1�����strs �е��������ּ�������
2��������������ֵ�ƽ����

����:
(1)����һ��String�ಢ��ֵ, �������sum(��)��time(ѭ������)
(2)����String���split����, ɸѡָ��ֵ, ��ͨ��for���

�ܽ�:
(1)ע��ʹ��split������ʱ��, +��ʱ��Ҫ��//, ȡ��ת����ʽ
*/
package cn.onedull.practice4;

public class Demo {

	public static void main(String[] args) {
		//����String  
		String[] strs = {"2+3+4","2+4","5+6","9+7"};
		int sum = 0;  //��
		int time = 0; //ѭ������
		for(String ele : strs) {
			String[] str = ele.split("\\+");
			for(String ele2 : str) {
				sum = sum + Integer.parseInt(ele2);
				time++;
			}
		}
		int average = sum / time; 
		System.out.println(sum + " " + average);
	}

}
