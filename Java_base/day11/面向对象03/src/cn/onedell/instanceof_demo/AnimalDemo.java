/*
������ʾ����ת����instanceof �ؼ��ֵ�ʹ��

����:
(1)����һ��animal�������������pig��dog
(2)��������ͨ��extends�̳и���
(3)�������pigʵ�ֶ�̬
(3)ͨ��instanceof���жϸö����Ƿ��Ƕ������ʵ��


�ܽ�:
(1)�����������󸳸��������, Ϊ�Զ�����ת��
(2)����������Ͷ����������ͱ���, ��ǿת����װ��, ǰ��ö������ʵ��������������
 */
package cn.onedell.instanceof_demo;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Pig();
		Pig p = (Pig)a;
		a.say();
		System.out.println(a instanceof Pig); //true
		System.out.println(a instanceof Animal); //true
		System.out.println(a instanceof Dog); //false
		
	}
}
