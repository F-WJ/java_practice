/*
������ʾ�����쳣throws ��ʹ��

����:
(1)����һ��Demo��
(2)����һ��static����, Ϊ�����������ĳ�
(3)ʹ��throws�׳��쳣

�ܽ�:
(1)throws��д�ڷ���������, �����ѵ����߸÷����п��ܴ����쳣
*/
package cn.odedull.title5;

public class ThrowsDemo {
	public static void main(String[] args) throws Exception {
		Divide(5, 1);
	}


	static void Divide(int a, int b) throws Exception{
		int div = a / b;
	}
}