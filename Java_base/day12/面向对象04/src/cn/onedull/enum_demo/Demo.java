/*
 ���󣺶���һ��ClothType ö���࣬��ʾ�·�����������������װ��Ůװ�����Է�װ
���ڲ������л�ȡö���еĳ������󣬲�����ö���е�name��ordinal ������
��ҵĿ�ģ�����ö�����ö�ٵ�ʹ��

����:
(1)����һ��ö����ClothType, ����������������MAN
(2)����һ��������Demo, ֱ��ʹ�������name, ordinal����

�ܽ�:
(1)ö���಻�ܴ�������, ʹ�õ�ʱ��, ֱ�ӵ���ö����ͺ�
*/

package cn.onedull.enum_demo;

public class Demo {
	public static void main(String[] args) {
		//ֱ��ʹ�������
		String name = ClothType.MAN.name();
		System.out.println(name);
		int num = ClothType.MAN.ordinal();
		System.out.println(num);
	}
}
