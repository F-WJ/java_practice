/*
���󣺲�ѯĳ��ʱ�����һ�ܵ���Ϣ����α�ʾ�����һ�ܵĿ�ʼʱ��ͽ���ʱ��

����:
(1)����Calendar����, ����set����, �޸�ֵ
(2)����add����,  �޸�ʱ��
(3)��ӡ��ʼʱ���7��ǰ��ʱ��

�ܽ�:
(1)Calendar����ͨ��add����set���޸�ʱ��, set�޸ĵ�ֵ, ��add��ͨ������ֵ���޸�
*/

package cn.onedull.title07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		String str = "2019-04-18 03:55:30";
		SimpleDateFormat sf = new SimpleDateFormat();
		//��������
		sf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date d = sf.parse(str);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		// Сʱ
		c.set(Calendar.HOUR_OF_DAY, 23);
		//����
		c.set(Calendar.MINUTE, 59);
		//��
		c.set(Calendar.SECOND, 59);
		Date end = c.getTime();
		System.out.println("����ʱ��: " + end.toLocaleString());
		
		//������
		c.add(Calendar.DAY_OF_MONTH, -7);
		c.add(Calendar.SECOND, 1);
		Date begin = c.getTime();
		System.out.println("��ʼʱ��: " + begin.toLocaleString());
	}

}
