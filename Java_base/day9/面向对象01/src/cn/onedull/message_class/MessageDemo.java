/*
 ��Ŀ:
1���Ķ���Ϣ�������Ҫ��
����(name)������
����(age) ��18
�Ա�(gender)����
Ӣ��(enScore)��90
��ѧ(mathScore)��135
����(cnScore)��105
����(name)������
����(age) ��20
�Ա�(gender)��Ů
Ӣ��(enScore)��130
��ѧ(mathScore)��100
����(cnScore)��125

1>������Ϣ����Ϣ�������һ��ѧ����(Student)��Ȼ��ʵ��������������2 ������

����:
(1)����һ��Message��, ��Աʹ��private���η�
(2)�ȴ���һ��message1����, Ȼ������ֵ
(3)message2ͬ��

�ܽ�:
(1)��װ: ����������ʵ��ϸ��, �������ṩ�˷���(ʹ��)
(2)getter����: ����һ���ֶε�ֵ
(3)setter����: ��ĳһ���ֶ�����ֵ
 */
package cn.onedull.message_class;

public class MessageDemo {

	public static void main(String[] args) {
		//��������
		Message message1 = new Message();
		//����ֵ
		message1.setName("����");
		message1.setAge(18);
		message1.setGender("��");
		message1.setEnScore(90);
		message1.setMathScore(135);
		message1.setCnScore(105);
		System.out.println(message1.getName());
		
		//��������
		Message message2 = new Message();
		
		//����ֵ
		message2.setName("����");
		message2.setAge(20);
		message2.setGender("Ů");
		message2.setEnScore(130);
		message2.setMathScore(100);
		message2.setCnScore(125);
		

	}

}
