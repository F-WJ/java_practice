/*
����һ������Գ�� Programmer����һ��˽�е� int ���͵��ֶ���� netInCome��
�� 3 ���������Է� eat�������� payRent������Ӱ seeMovie��
�� 3 ��������������һ�� int ���͵Ĳ��� money ��ʾ���ѽ����ڶ�������������㡣*
Ҫ��
1)��ʵ�� Programmer ��Ķ��壻                                                
2)������һ�������� TestDemo���� main �����д��� Programmer ��ʵ�� p1��
��ʼ���Ϊ 13000 Ԫ��ÿ�³Է�����Ϊ 1000 Ԫ������ÿ�� 1000 Ԫ��
��Ů�ѿ���Ӱ 200*2 Ԫ�����ӡ p1 �����


����:
(1)����һ������Գ��Programmer, ��Ա�������netInCome(int����), ��ʼֵΪ13000,  ������෽��
	�Է�(eat)��������(payRent)������Ӱ(seeMovie), ��������Ϊ���ѽ��monery(int����)
(2)����һ��������TestDemo, ����Programmer����, ����3������ 

�ܽ�:
(1)�����в�������ǻ�����������, �������ֵ
 
*/
package cn.onedull.practice03;

public class TestDemo {

	public static void main(String[] args) {
		//��������
		Programmer p1 = new Programmer(13000);
		p1.eat(1000);
		p1.seeMovie(400);
		p1.payRent(1000);
		System.out.println(p1.getNetInCome());
	}

}
