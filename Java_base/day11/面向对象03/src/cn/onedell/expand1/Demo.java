/*
 ���н�ͨ����(Seater)�����⳵��Taxi�����ͻ���Airliner�����ʹ���Ship�������ڽ�ͨ���ߣ�
����ͨ���߶���Ʒ��(brand)���ؿ���Ϊ��manned�����ͻ�ʵ���˷���Ĺ��ܣ�IFly��������
��ʵ���˵�·���ܵĹ��ܣ�IRun�����ʹ�ʵ�����εĹ��ܣ�ISwim����
Ҫ��
1)�ü̳кͽӿڣ�ģ�����ͨ���ߺ͹��ܵĹ�ϵ�������ýӿڡ�
2)���ڲ������main �������ö�̬��֪ʶ����ӡ�����⳵��ʼ���ˡ�,���ɻ���ʼ����
�ˡ�,��������ʼ�ں�����Ư���ˡ��������Ǵ��ڽݴ���⳵�����ؿ���Ϊ���������ǲ����ɻ���
���ؿ���Ϊ����������̩����˺ţ����ؿ���Ϊ����

����:
(1)������һ���ӿ�ͨ����, ʵ������fly, swim, run��
(2)����һ��������function. ����ͨ�ýӿ���
(3)����һ����ͨ������seater, ����Ʒ��, �ؿ���Ϊ, ���ֱ���, �̳й�����function
(4)����������demo, ������ͨ���߶���,  ���÷���

�ܽ�:
(1)����һ��ͨ�ýӿ�, ������������������, ֱ�Ӵ�������,Ȼ��ֵ
 */
package cn.onedell.expand1;

public class Demo {
	public static void main(String[] args) {
		Seater taxi = new Seater();
		taxi.setTool("���⳵");
		taxi.print1();
		IFunction run = new Run();
		taxi.function(run);
		taxi.setManned("�ؿ���Ϊ");
		taxi.setBrand("���ڽݴ�");
		taxi.print2();
		
		System.out.println("---------------------");
		
		Seater airliner = new Seater();
		airliner.setTool("�ɻ�");
		airliner.print1();
		IFunction fly = new Fly();
		airliner.function(fly);
		airliner.setManned("�ؿ���Ϊ");
		airliner.setBrand("����");
		airliner.print2();
		
		System.out.println("---------------------");
		
		Seater ship = new Seater();
		ship.setTool("�ʹ�");
		ship.print1();
		IFunction swim = new Swim();
		ship.function(swim);
		ship.setManned("�ؿ���Ϊ");
		ship.setBrand("̩����˺�");
		ship.print2();
		
		System.out.println("---------------------");
	}
}
