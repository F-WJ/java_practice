/*
�ֱ𴴽�Ա���ࣨEmployee���Ͳ����ࣨDepartment��������Ա������Ա��������name����
����(age)���������к��в������ƣ�deptName����ÿ�������к���һ�����ϣ�emps����
ʾһ�������к��ж��Ա����ÿ��Ա������Ψһ�ģ������¼���˳��

�������²�����Ϣ��
��������Ա������Ա�����䲿������Ա������Ա������
����1 С��22 ����2 ��������18
����23 �������28
����21 ����25
Ҫ��1������JavaBean �淶����Ա���ࣨEmployee���Ͳ����ࣨDepartment����
2��ʹ���вι�����������Ա����Ϣ��������1 �Ͳ���2 ��������

hashset
����:
(1)����Ա����Employee, ��Ա��������name(String����),  ����age(int����)
(2)���岿����Department, ��Ա������������deptName(String����)
(3)���������Demo, �������Ŷ���,
(4)����HashSet����, ����add ���Ա������
(5)����HashMap����, ����put���벿�ź�Ա��
(6)��ӡ���

�ܽ�:
(1)
*/
package cn.onedull.practice03;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		//����
		Department dt1 = new Department("����һ");
		Department dt2 = new Department("���Ŷ�");
		
		//����1Ա��
		HashSet<Employee> emps1 = new HashSet<Employee>();
		emps1.add(new Employee("С��", 22));
		emps1.add(new Employee("����", 23));
		emps1.add(new Employee("����", 21));
		
		//����2Ա��
		HashSet<Employee> emps2 = new HashSet<Employee>();
		emps2.add(new Employee("��������", 18));
		emps2.add(new Employee("�������", 28));
		emps2.add(new Employee("����", 25));
		
		//����HashMap����
		HashMap<Department, HashSet<Employee>> map = new HashMap<Department, HashSet<Employee>> ();
		map.put(dt1, emps1);
		map.put(dt2, emps2);
		
		System.out.println(map);
		
		//����
		
			
		
	}

}
