/*
ʵ��һ����ΪPerson�������������Employee����ͨԱ������Manager��������Employee�����࣬
���һ������addSalary��Ϊ�ǹ��ʣ���ͨԱ��һ������10������������20���� 

����:
(1)����Person��, ��Ա����������name(String����)����ַaddress(String����)�����������вι��췽���� 
(2)����Employee��, ��Ա��������id(String��)������salary(double����)������(int��)��
	���������вι��췽��,��Ա����addSalary()
(3)����Manager��, ��Ա�����м���level(String����)�������Ĺ��췽��, ��Ա����addSalary()
(4)��дһ��������Demo������Emloyee, ����addSalary����
(5)ͨ����̬����Manager����, ����addSalary����

�ܽ�:
(1)���ö�̬˼��, �������ָ����������ʱ��, ���õķ���ʵ�ʵ��������෽��
*/
package cn.onedull.practice02;

public class Demo {

	public static void main(String[] args) {
		//����Ա�������
		Employee em = new Employee("1", 7000, 8);
		em.setName("С��");
		//�������������
		Employee em2 = new Manager();
		em2.setSalary(10000);
		em2.setName("������");
		//
		em.addSalary(em.getSalary());
		em2.addSalary(em2.getSalary());
		
		
	}

}
