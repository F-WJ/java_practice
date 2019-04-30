/*��һ���ַ���name= С��&age=17&salary=8000.00&hireDate=1991-07-03;name= С��
&age=23&salary=10000.00&hireDate=1992-12-11;name= С��
&age=18&salary=12000.00&hireDate=1996-01-09��
����ַ����е����ݷ�װ��Employee �Ķ����У�
��Employee ��name��String ���ͣ���age��int ���ͣ���salary��нˮ��BigDecimal ���ͣ���
hireDate����ְ������Date ���ͣ� �ĸ��ֶ��ҷ���JavaBean �淶
�����������Ķ����������У������1996 ��ǰ��ְ��Ա���ĵ�ƽ��н�ʡ�*/
package cn.onedull.expand1;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		//String��
		String name = "name= С��&age=17&salary=8000.00&hireDate=1991-07-03;name= С��&age=23&salary=10000.00&hireDate=1992-12-11;name= С��&age=18&salary=12000.00&hireDate=1996-01-09";
		//Employee����
		Employee[] e = new Employee[3]; 
		String[] str = name.split(";");
		for(int i= 0; i< str.length; i++) {
			String[] str2 = str[i].split("&");
			//��������
			Employee emp = new Employee();
			emp.setName(str2[0].substring(str2[0].indexOf("=") + 1).trim());
			emp.setAge(Integer.parseInt(str2[1].split("=")[1].trim()));
			emp.setSalary(new BigDecimal(str2[2].split("=")[1].trim()));
	
			//�������ڸ�ʽ
			SimpleDateFormat sf = new SimpleDateFormat();
			sf.applyPattern("yyyy-MM-dd");
			emp.setHireDate(sf.parse(str2[3].split("=")[1].trim()));
			e[i] = emp;	
		}
		
		//�����1996 ��ǰ��ְ��Ա���ĵ�ƽ��н�ʡ�
		BigDecimal sum = new BigDecimal("0");
		BigDecimal time = new BigDecimal("0");
		for(Employee ele : e) {
			SimpleDateFormat sf = new SimpleDateFormat();
			sf.applyPattern("yyyy");
			if(Integer.parseInt(sf.format(ele.getHireDate())) < 1996){
				sum = sum.add(ele.getSalary());
				time = time.add(new BigDecimal("1"));
			}
		}
		System.out.println(sum.divide(time));
		
		
		
		
		
	}

}
