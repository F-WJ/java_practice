package test1;

public class Son extends Father {
	public static void main(String[] args) {
		new Son().run();
	}

	private final void run() {
		System.out.println("son");
		
	}
}

//����
class Father {
	private final void run() {
		System.out.println("father");
	}
}

/*
�������
1.���֪ʶfinal���εķ��������Ա���д����������final���εķ���������д����뱨��
private���εķ�����������ʱ���ɼ��ģ�ͬ���ķ������ڸ����������ͬʱ���ֱ�ʾ�����¶���ķ������븸���޹ء�
���ุ�������ͬ����ʱ��������е���ʱ�����ȵ�������ķ�����

2.Դ�����
������һ��Son��̳���Father��
����new��һ��Son���󣬲��ҵ���������run()����
������һ����һ��private��final���ε�run���������son
������Father�࣬ͬ����һ��private��final���ε�run���������father

3.�𰸽���
��Ϊ�����run������private��final��������������޹أ����ȥ��private������run()���������˱�����벻�������⡣
����ֱ�ӵ��������run�������son
 */
