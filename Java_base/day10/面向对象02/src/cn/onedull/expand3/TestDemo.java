/*
�����Ĳ�������������:------>���ݵ��Ƕ���ĵ�ֵַ.
�����ķ���ֵ����������:---->���ص��Ƕ���ĵ�ֵַ

��ĳ�Ա�����޸�����
	1:�Ȼ�������Ա������ֵ
	2:�������Ա����ֵ�޸�
	3:���޸ĺ��ֵ������ӵ�������
	
	
�����Ĳ�������������(�Զ�������),��ʽ�������޸�Ӱ��ʵ�ʲ���
		��Ϊ�������ݵ��Ƕ���ĵ�ֵַ,���������ñ���ָ����ͬ��ֵַ��ʱ��,
		һ���޸�����,��һ��Ҳ������޸�.
 */
package cn.onedull.expand3;

public class TestDemo {
	public static void main(String[] args) {
		//����һ�����鲢��̬��ʼ��
		int[] a = new int[3];
		//����test����
		Test1 test = new Test1();
		System.out.println("��������aֵ: " + a); // ��������aֵ: [I@659e0bfd
		test.setArr(a);
		System.out.println("����arrֵ: " + test.getArr()); // ����arrֵ: [I@659e0bfd
		
		
		System.out.println("--------------------------");
		
		Test2 t = new Test2();
		System.out.println("Test2 tֵ: " + t);
		Test1 test2 = new Test1(t);
		System.out.println("Test1 tֵ: " + test2.getTest2());
		t.setNum(1);
		System.out.println(t.getNum());
		
		
		
	}
}
