/*
����:
��Ʒ��: Item
���г�Ա����:
���(code) String ������Ʒ���
����(name) String ������Ʒ����
���(type) String ������Ʒ�ľ������
�۸�(price) double ������Ʒ�ļ۸�
����Ʒ������totalNum�� int ������Ʒ������Ʒ����
1)�ṩ����������
��û�в����Ĺ�����
������һ���Ա��(code),����(name) ��Ϊ��ʽ�����Ĺ�����
2)��дһ��main ����,���һ����Ʒ,����Ʒ��Ϣ����
���������ʼǱ����Ե���Ʒ(computer),
��Ʒ1��
���(code):666
����: ����(DELL) ��Ϸ�ʼǱ�
����: ��Ϸ
�۸�: 5499.00
��Ʒ2��
���(code):007
����: ƻ����Macbook pro���ʼǱ�
����: ����,�칫
�۸�: 18000.00

3����main ������ӡ�ʼǱ�����(computer)�����ƺͼ۸�
4��ÿ����һ����Ʒ��������Ʒ������totalNum����һ������main �����д�ӡtotalNum

����:
(1)����һ��Item��,  �����ĸ�private������Ʒ���(code), ����(name), ���(type), 
	�۸�(price)��Ա����, һ��static��������Ʒ����(totalNum)��Ա����, ����һ���вι�����
(2����һ����Item���д���main����,  ����������Ʒ
(3)����������Demo, ��������, ����main����


�ܽ�:
(1)����Ա����ʹ��static���κ�, ֵ�ᱻ���ж���������
ֵ��
 */
package cn.onedull.practice1;

public class Demo {

	public static void main(String[] args) {
		//��������
		Item computer1 = new Item();
		computer1.main("666", "����(DELL)��Ϸ�ʼǱ�", "��Ϸ", 5499.00);
		Item computer2 = new Item();
		computer2.main("007", "ƻ��(Macbook pro)��Ϸ�ʼǱ�", "����, �칫", 18000.00);

		
	}

}
