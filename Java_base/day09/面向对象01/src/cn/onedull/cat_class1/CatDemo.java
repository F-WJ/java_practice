/*
������ΪCat ��Ͷ���Ĳ�����

���裺
Cat��
(1) è�����֡������״̬
(2) ˵���Ĺ���

CatDemo��
��1������Cat ����c
��2��ʹ��c �������˵������
��3���������Ա��������ֵ
��4����ʹ��c �������˵���������۲��Ա������ֵ�ĸı�
��5����ȡc ����ĳ�Ա����

�ܽ�:
(1)����Ƕ��ʵ�����������, ��������Ǹ��������ľ������
(2)���������﷨: ���� ��������� = new ����();
 */
package cn.onedull.cat_class1;

public class CatDemo {
	public static void main(String[] args) {
		//��������
		Cat c = new Cat();
		//���÷���
		c.say();
		//����ֵ
		c.name = "С��";
		c.say();
		//��ȡ����ĳ�Ա����
		String name = c.name;
		System.out.println(name);
	}
}
