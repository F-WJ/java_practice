/*
���������Զ����쳣������쳣��LowAgeException����������쳣(HighAgeException)��
���ʸ��쳣��HighSalaryException�������Ƿֱ�Ϊ����ʱ�쳣�����ҵ����˸��๹����public
RuntimeException(String message); public RuntimeException(String message, Throwable cause)
��дһ��Ա���ࣺ
(1) �����ԣ�
��ţ����������䣬���ʣ����֤���룬Ա��������Ա�������ܶ�
(2) �й�������
�����������ñ�ţ����䣬�������������С��18���׳�������쳣������������60 ��
��������쳣���������Ϊnull ��Ϊ���ַ������׳����쳣��
(3) �з���
���ӹ���addSalary(double addSalary)�������׳����ʸ��쳣�������Ӻ�Ĺ��ʴ���Ա����
���ܶ�ʱ���׳����쳣��

����:
(1)���������Զ����쳣��, ������쳣��LowAgeException����������쳣(HighAgeException)��
���ʸ��쳣��HighSalaryException��, ���̳�RuntimeException, �����вι�����, �������ݴ�����Ϣ
(2)����һ��Ա����, 6��private���ͳ�Ա����(��ţ����������䣬���ʣ����֤���룬Ա������), 
һ��static���ͳ�Ա����(Ա�������ܶ�), һ��addSalary����
(3)���вι������������ʹ��throw�쳣����
(4)����������Demo, ����Ա������, ������Ӧ����, ����

�ܽ�:
(1)����ĳһ����ʱ, ����ʹ��static����, ���ֶι���
*/
package cn.odedull.practice1;

public class Demo {

	public static void main(String[] args) {
		Staff st1 = new Staff(1, "С��", 19);
		//����
		st1.setSalary(8000);
		Staff.staffSalarySum = st1.getSalary();
		Staff st2 = new Staff(2, "С��", 20);
		st2.setSalary(18000);
		Staff.staffSalarySum = st2.getSalary();
		st1.addSalary(10000);
	}

}
