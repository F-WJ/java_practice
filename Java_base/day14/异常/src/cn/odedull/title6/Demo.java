/*
�����Զ����쳣LogicException��ʹ���Զ����쳣ģ���û�ע�Ṧ��


����:
(1)�Զ���һ��LogicException�쳣��,  �̳�RuntimeException.
(2)�Զ���һ��LoginException2�쳣��, �̳�Exception
(3)���������Demo, ����һ��String�ַ���������,  ģ���û�ע���ע������
(4)ͨ��forѭ����if����ж�, ע���˺��Ƿ����, ������ڵĻ�,  �׳��쳣.

�ܽ�:
(1)�Զ����쳣��, ͨ���Ǽ̳�RuntimeException, �Ͷ���һ���������Ĺ�����, �����ø��๹����,,
	��������������Ϣ
*/
package cn.odedull.title6;

public class Demo {

	public static void main(String[] args) throws LogicException{
		//ģ���û�ע��
		String str = "��Ѽ";
		//ģ�����ݿ���ע���˺�
		String[] strName = new String[]{"����", "��Ѽ", "����"};
		
		for(String ele : strName) {
			if(ele.equals(str)) {
				throw new LogicException("�˺����Ѵ���");
			}
		}
	}

}
