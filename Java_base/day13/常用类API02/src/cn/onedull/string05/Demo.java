/*
5:String[] arr = {"1990-1-1","2009-1-5","2019-5-7"};
 ��arr��ʱ����Ϣת���� Date�� ʱ�����.�����ڶ�Ӧ��������.
 
˼·:
(1)�ȴ���һ��Date��������, �������Date��������
(2)����forѭ����SimpleDateFormat�������ַ���ת����Date����

�ܽ�:
(1)ͨ��SimpleDateFormat�������ڵ�ת��
*/
package cn.onedull.string05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		//����String����
		String[] arr = {"1990-1-1","2009-1-5","2019-5-7"};
		Date[] date = new Date[arr.length];
		for(int i = 0; i < arr.length; i++) {
			SimpleDateFormat sf = new SimpleDateFormat();
			sf.applyPattern("yyyy-MM-dd");
			date[i] = sf.parse(arr[i]);
			
		}
		//��ӡ
		System.out.println(Arrays.deepToString(date));
	}

}
