package cn.onedull.practice2;

public class Print implements ILowercaseLetter, IUppercaseLetter{
	//Сд
	public void printLowercaseLetter(String str) {
		str = str.toLowerCase();
		System.out.println(str);
	}
	
	//��д
	public void printUppercaseLetter(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}
}


/*
 * 2)Ҫ�󸲸�printUppercaseLetter()����ʵ��Ϊ������Ա����str ת������ӡΪȫ��дӢ����ĸ
 * �Ĺ��ܣ�����printLowercaseLetter()����ʵ��Ϊ��
 * ����Ա����str ת������ӡΪȫСдӢ���� ĸ�Ĺ��ܡ� ����ʾ�������65
 * ΪA�����97 Ϊa����
 */