/*
����ʹ������Date �ೣ�÷���

����:
(1)����Demo��, ��main�����д���Date����, ��ӡDate����
(2)����Date����,

�ܽ�:
(1)�󲿷ַ����Ѿ�������, �õ�ʱ��, ���ʹ��SimpleDateFormat��ķ���, ���� Calndar��ķ���
*/

package cn.onedull.title04;

import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);	  //Thu Apr 18 03:15:32 CST 2019
		//���������ʽ
		System.out.println(d.toLocaleString());  //2019-4-18 3:16:14
		//������1970��1��1���������ɴ� Date�����ʾ��00:00:00 GMT�ĺ�����
		System.out.println(d.getTime());
	} 

}
