/*
����һ�������û���(User)�������û�id(id)���û���(username)�û�����(password)��
email ��ַ(emailAdrr)�ĸ�˽�л���Ա������һ����������û�������(totalUser)��
(1)�붨��һ�������û�id(id)���û���(username)�û�����(password)���������Ĺ�
����������ĸ�ʵ����Ա�����ĳ�ʼ��������email ��ַ(emailAdrr)���û��������ַ���
��@gameschool.com����
(2)��������������������main ������ʵ���������û������ÿ����һ�������û�
������(totalUser)��һ����������ʵ��������ӡ�û���������

����:
(1)����һ��user��, ��������private���εĳ�Ա�����û�id(id), username(����), pasword(�û�����),
	����һ��static���εĳ�Ա����totalUser
(2)����������Demo, ��������Usre����, ��ӡ�û�����totalUser��ֵ 


�ܽ�:
(1)��Ա��һ��ʹ����static���η�, ����ֵ�����ж�����, һ���޸�, �໥Ӱ��
*/
package cn.onedull.practice3;

public class Demo {
	public static void main(String[] args) {
		//��������
		User user1 = new User(1, "Сƨ", "1234325" );
		user1.setEmail("1234567");
		User user2 = new User(1, "С��", "12343235" );
		user1.setEmail("1234567233");
		User user3 = new User(1, "С��", "1234532" );
		user1.setEmail("1234567343");
		int sum = User.totalUser;
		//��ӡtotalUserֵ
		System.out.println(sum);
	}
		
}
