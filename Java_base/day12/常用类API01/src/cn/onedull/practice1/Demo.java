/*
1.ʵ�ֹ��ܶ�ָ�������дʻ���й����滻�������дʹ��˳�*�����
��ԭ�䣺���Ѳݣ�������ͣ���ˣ���
���˺�Ϊ����**��������ͣ���ˣ���
������
1����Ҫ�洢���ָ�������е��ʣ�
2��������е������ֶ���Ҫ�жϼ����ˣ�
3���������滻��
4���滻��*�ַ���ԭ�ַ�������ͬ��

����:
(1)����Demo��, �����ַ���, ����replace����������ĳЩ��Ϣ.
(2)ʹ��for���ͳ����������.

�ܽ�:
(1)ʹ��string���replace�������޸�ĳЩ�ַ�
*/
package cn.onedull.practice1;

public class Demo {
	public static void main(String[] args) {
		//ԭ��
		String str1 = "�˽֣�������ͣ���ˣ�";
		//������Ϣ
		String str2 = "�˽�";
		//������Ϣ�ĳ���
		int num = str2.length();
		//����*������
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= num; i++) {
			s.append("*"); 
		}
		String star = s.toString();
		String str3 = str1.replace(str2, star);
		System.out.println(str3);
		
		
	}
}
