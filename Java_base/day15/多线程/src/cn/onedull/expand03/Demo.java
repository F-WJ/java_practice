/*
3�����������࣬һ�� Person �࣬һ�� Gun �ࡣ Gun ������һ������(int �������)��ʼ����Ϊ 5��
����һ��װ�ӵ��ķ��� push������ӵ��ķ��� pop��Person ����һ��ʵ������ shoot ������
���� Gun �� ���� pop�����ô���ģ��һ���˿�ǹ����Ĺ��̣�װ���ӵ���װ���˾Ͳ�����װ���
�����û�ӵ��������������װ�����ӵ��������ȥ��

����:
(1)����һ��Person��, ����һ��ʵ������shoot()
(2)����һ��Gun��, ������һ������(int �������)��ʼ����Ϊ 5������һ��װ�ӵ��ķ��� push������ӵ��ķ��� pop��

*/
package cn.onedull.expand03;

public class Demo {

	public static void main(String[] args) {
		Person person = new Person();
		//װ���ӵ�
		person.gun.push();
		//���
		person.shoot();
		
	}

}
