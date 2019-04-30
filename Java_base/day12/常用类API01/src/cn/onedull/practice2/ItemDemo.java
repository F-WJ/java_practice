/*
����һ����Ʒ��(Item)��ӵ��˽�л��ĳ�Ա������Ʒ����(name)����Ʒ�۸�(price)������
�����г�Ա������setter ��getter �����������ṩһ���޲����Ĺ�������һ�����в����Ĺ�
������
�����ֶ�String text="name���ƶ�Ӳ�̣�price��58.0"����ͨ�����������ط��������ı�text
����Ϣ����һ����ӦItem ����
������
1�����ַ������в��
2����ֺ���ַ���ת���ɺ���Ʒ��(Item)�ֶ�������ͬ������
3����ת��������ݱ��浽������

����:
(1)����Item��, ��������˽�б�����Ʒ����(name), ��Ʒ�۸�(price), ����һ���޲ι�����, ��һ���в�
 	�����Ĺ�����.
(2)����������, ����һ���ַ���, ����indexOF��substring����, ��ɸѡ����Ҫ����Ϣ

�ܽ�:
(1)ͨ��substring����ȡ��Ҫ���ַ�����Ϣ.
*/
package cn.onedull.practice2;

public class ItemDemo {

	public static void main(String[] args) {
		String str = "name���ƶ�Ӳ�̣�price��58.0";
		
		//��һ��
		int x = str.indexOf("��");
		int y = str.indexOf("��");
		String name = str.substring(x + 1, y).trim();
		System.out.println(name);
		//�ڶ���
		String newstr = str.substring(y + 1);
		int x2 = newstr.indexOf("��");
		String price = newstr.substring(x2 + 1).trim();
		Double d = Double.valueOf(price);
		System.out.println(price);
		
		//��������
		Item item = new Item(name, d);
		System.out.println(item.getName() + ": " + item.getPrice());
		
		
		
	}

}
