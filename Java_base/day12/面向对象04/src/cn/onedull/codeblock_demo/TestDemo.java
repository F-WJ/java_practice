/*
������ʾ��̬����顢��ʼ������顢�ֲ�������д��

����:
(1)����һ��Test��, ����һ��static�����, ��ʼ�������, �ֲ������
(2)����������TestDemo, ��������, ����say����, �۲��ӡ���

�ܽ�:
(1)��̬�����: ��������ֽ����ļ����ص�JVM, ��ִ��static�����
(2)��ʼ�������: ���������ʱ��, ��ִ����δ���
(3)�ֲ������: �����ڷ�������Ĵ����. ���÷�����ʱ��, �ͻ�ִ��
*/

package cn.onedull.codeblock_demo;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("������");
		//��������
		Test test = new Test();
		test.say();
	}

}
