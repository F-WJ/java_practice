/*
����һ�������û��ࣨUser���������û�ID(id)���û����루password����email ��ַ��emailAdrr��
����˽�л���Ա������
�붨��һ�������û�ID(id)���û����루password�����������Ĺ��������������ʵ����
Ա�����ĳ�ʼ��������email ��ַ��emailAdrr�����û�ID �����ַ�����@gameschool.com����
��������������������main ������ʵ���������û�����󲢴�ӡ������Ϣ

����:
(1)����һ��User��, ����������˽�г�Ա����id(�û�ID)��password(�û�����), ע��email��ַ, ����һ�������ַ�ַ���
(2)����һ���޲ι�������һ���вι�����
(3)����������UserDemo, ����User����
(4)����ֵ�ʹ�ӡֵ

�ܽ�:
(1)����setter���������޸ĳ�ʼֵ������
 */
package cn.onedull.expand1;

public class UserDemo {

	public static void main(String[] args) {
		//��������
		User user = new User(1, "1234");
		//����ֵ
		user.setEmailAdrr("36459000");
		//��ӡֵ
		System.out.println("ID: " + user.getId());
		System.out.println("password: " + user.getPassword());
		System.out.println("email: " + user.getEmailAdrr());
		
		

	}

}
