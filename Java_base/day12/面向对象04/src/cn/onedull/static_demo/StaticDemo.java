/*
���󣺶���һ������Dog���ڹ����ж��徲̬�ֶκ;�̬��������������ֶκͶ��󷽷���
����StaticDemo �����в��Ե��ù����еķ������ַ�
��ҵĿ�ģ����static �ؼ��ֵĺ����ʹ��

����:
(1)����һ��Dog��, ����һ����̬����age��һ��˽�˳�Ա����(����JavaBean�淶)
(2)����������StaticDemo , ֱ��ʹ���������þ�̬�����;�̬����.
(3)���������, ���ö��󷽷����ֶ�.

�ܽ�:
(1)ʹ����static���ε��ֶκͷ���, ֱ��������, ʹ�õ�ʱ��ֱ��ʹ���������þͺ�
*/

package cn.onedull.static_demo;

public class StaticDemo {
	public static void main(String[] args) {
		Dog.say();
		Dog.age = 11;
		//��������
		Dog d = new Dog();
		d.setName("����");
		d.eat();
	}
}
