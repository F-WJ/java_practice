/*
���󣺴���Calendar ���󣬲��ֱ����úͻ�ȡ���ڵ��ꡢ�¡��ա�ʱ���֡��롣
��ҵĿ�ģ�����Calendar ����Ĵ������򵥵����úͻ�ȡ������Ϣ��

����:
(1)����Calendar����, 
(2)ͨ��get����, ��ӡ��, ��, ��, ʱ, ��, ��

�ܽ�:
(1)��ȡ��ֵ����int����
*/
package cn.onedull.title06;

import java.util.Calendar;

public class Demo {

	public static void main(String[] args) {
		//��������
		Calendar c = Calendar.getInstance();
		//��ȡ��
		System.out.println(c.get(Calendar.YEAR));    //2019
		//��ȡ��
		System.out.println(c.get(Calendar.MONTH));   //3
		//��ȡ��
		System.out.println(c.get(Calendar.DAY_OF_MONTH));  //18
		//��ȡʱ
		System.out.println(c.get(Calendar.HOUR_OF_DAY));   //3
		//��ȡ��
		System.out.println(c.get(Calendar.MINUTE));        //47
		//��ȡ��
		System.out.println(c.get(Calendar.SECOND));        //16
		//��ȡ���ڼ�
		System.out.println(c.get(Calendar.DAY_OF_WEEK));        //5
		
		int minMonth = c.getActualMinimum(Calendar.MONTH);
		System.out.println("minMonth = " + minMonth);
		System.out.println("\\n");
	


		
	}

}
