/*
�����Ҽ���һ�ֶ��Animal����������Ľ�����shout������ô���ģ��²�������Ϊ���
�����ж�����̬��
����ö����ǹ���Dog���������ǣ�������...
����ö�����è��Cat���������ǣ�������...

����:
(1)�ȴ�������Animal(����), ����Cat(è), Dog(��),  ��������дһ��say����
(2)����һ��������(TestDemo), ��������,  �����﷨�Ǹ�����  ������ = new ����, ʵ�ֶ�̬
(3)����say����

�ܽ�:
(1)��̬��ǰ�����������Ǽ̳й�ϵ
(2)��̬, ������÷���ʵ���ǵ�������ķ���
 */
package cn.onedell.polymorphism_demo;

public class TestDemo {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.say();
		Animal a2 = new Cat();
		a2.say();
	}
}
