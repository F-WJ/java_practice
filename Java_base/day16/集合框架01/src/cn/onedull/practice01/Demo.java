/*
����ʹ��.
��дһ������Point, ��X,Y ����.
�ڴ���5 ��Point ����, ��ӵ�list ����ArrayList ��
��ɾ������Ϊ2 �ĵ����
���ٰ�list �ϼ�������Ϊ3 �ĵ�����޸ĳ�����X=3,Y=3 �ĵ����
�ݱ���list ���϶��󲢴�ӡ�����list ������������

����:
(1)����һ��Point��, ��Ա����x(int����), y(int����)
(2)���������Demo, ����5��Point����, ��x��y������.
(3)����ArrayList����, ����add����, get������Ӻ��޸�
(4)����forѭ����size��������list����

�ܽ�:
(1)ArrayList��Ӷ���ʱ, ���������ڴ��ַ, ���Ƕ��������
*/
package cn.onedull.practice01;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		//����Point����
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(5, 6);
		Point p4 = new Point(7, 8);
		Point p5 = new Point(9, 10);
		
		//����ArrayList����
		ArrayList list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		//ɾ������Ϊ2�Ķ���
		list.remove(2);
		
		//������Ϊ3�Ķ����޸ĳ�����x-3, y=3
		p3 = (Point)list.get(3);
		p3.setX(3);
		p3.setY(3);
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i).toString());
		}
		
		
		
	}

}
