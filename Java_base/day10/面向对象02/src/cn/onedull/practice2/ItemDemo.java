/*
����:
��Ʒ��: Item
���г�Ա����,
���(code) String ������Ʒ���
����(name) String ������Ʒ����
���(type) String ������Ʒ�ľ������
�۸�(price) double ������Ʒ�ļ۸�
1)�ṩ����������
��û�в����Ĺ�����
������һ���Ա��(c),����(n) ��Ϊ��ʽ�����Ĺ�����
2)��дһ��main ����,���һ����Ʒ,����Ʒ��Ϣ����
���������ʼǱ����Ե���Ʒ(computer)

����:
(1)����һ��Item��, ��Ա����Ϊcode(���), name(����), type(���), price(�۸�), ��Ա����Ϊmain
(2)����������ItemDemo��, ����Item����, ͨ������getter��������ֵ, ������main����

�ܽ�:
(1)ͨ���в�����������ʼ��ֻ�ܳ�ʼ��һ��
(2)ͨ��ʹ��main����, ������Ҫ��ӡ��Ϣ��������, �����������������
 */
package cn.onedull.practice2;

public class ItemDemo {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setCode("666");
		item1.setName("�����ʼǱ�");
		item1.setType("��Ϸ");
		item1.setPrice(5499.00);
		item1.main();
		
		
		System.out.println("---------------------------");
		Item item2 = new Item();
		item2.setCode("007");
		item2.setName("ƻ���ʼǱ�");
		item2.setType("����, �칫");
		item2.setPrice(18000.00);
		item2.main();
		
	}

}
