/*
��дһ������:
public int getAge(String text){// ���� xxxx��xxx��xxxx�մ������ڵ��ַ�����Ϣ
//���� ���������������


˼·: ʹ��Calender��ȡ��ǰ����������textͨ��SimpleDateFormat��ʽ������������Ա�

*/
package cn.onedull.string11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		String text = "1994��4��23��";
		int age = Demo.getAge(text);
		System.out.println(age);
	}
	
	static int getAge(String text) throws ParseException {
		Calendar c = Calendar.getInstance();
		//��ǰ��
		int currentyear = c.get(Calendar.YEAR);
		//��ǰ��
		int currentmouth = c.get(Calendar.MONTH) + 1;
		//��ǰ��
		int currentdate = c.get(Calendar.DAY_OF_MONTH);
		
		//text
		SimpleDateFormat sf = new SimpleDateFormat();
		sf.applyPattern("yyyy��MM��dd��");
		Date date = sf.parse(text);
		sf.applyPattern("yyyy-MM-dd");
		int y = Integer.parseInt(sf.format(date).split("-")[0]);
		int m = Integer.parseInt(sf.format(date).split("-")[1]);
		int d = Integer.parseInt(sf.format(date).split("-")[2]);
		
		if(currentmouth == m && currentdate >= d) {
			int age = currentyear - y;
			return age;
		}else if(currentmouth == m && currentdate < d){
			int age = currentyear - y - 1;
			return age;
		}else if(currentmouth > m) {
			int age = currentyear - y;
			return age;
		}
		else {
			int age = currentyear - y - 1;
			return age;
		}
		
	}

}
