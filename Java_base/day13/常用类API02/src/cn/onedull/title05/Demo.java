/*
����ͨ��SimpleDateFormat ����и�ʽ���ͽ�������
����:
(1)����һ��Date�����SimpleDateFormat����
(2)����format����, ��ʽ������, �޸ĳ��Զ�������ģʽ
(3)����parse����, �����ַ�����������, ת����Date����

�ܽ�:
(1)Date����תString����, Ϊ��ʽ������(format)
(2)String����תDate����, Ϊ��������(parse)
*/
package cn.onedull.title05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat();
		//��������ģ��
		sf.applyPattern("yyyy-MM-dd HH:mm:ss");
		//��ʽ������
		String str = sf.format(d);
		System.out.println(str);  //2019-04-18 03:28:49
		//��������
		Date d2 = sf.parse(str);
		System.out.println(d2);   //Thu Apr 18 03:31:04 CST 2019
	}

}
