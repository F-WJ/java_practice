/*
����ʹ��.
��дһ������Point, ��X,Y ����.
�ڴ���5 ��Point ����, ��ӵ�list ����ArrayList ��
��ɾ������Ϊ2 �ĵ����
���ٰ�list �ϼ�������Ϊ3 �ĵ�����޸ĳ�����X=3,Y=3 �ĵ����
�ݱ���list ���϶��󲢴�ӡ�����list ����

����:
(1)����Point��, ��Ա��������X(int����),  ����Y(int����)
(2)���������Demo, ����ArrayList����,
(3)����add�������Point����
(4)����remove����ɾ��ָ������
(5)����foreach��������Ԫ��

�ܽ�:
(1)ArrayList����Ԫ�ؿ���ֱ��ʹ��foreach.
*/
package cn.onedull.practice01;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		//����add���Point����
		list.add(new Point(1, 2));
		list.add(new Point(1, 3));
		list.add(new Point(2, 6));
		list.add(new Point(3, 9));
		list.add(new Point(5, 4));
		
		
		try {
			//ɾ������Ϊ2 �ĵ����
			list.remove(2);
			//�ٰ�list �ϼ�������Ϊ3 �ĵ�����޸ĳ�����X=3,Y=3 �ĵ����
			Point p = list.get(3);
			p.setX(3);
			p.setY(3);
		}catch(IndexOutOfBoundsException e){
			System.out.println("����������Χ");
		}
		
		//����list ���϶��󲢴�ӡ�����list ����
		for(Point ele : list) {
			System.out.println(ele);
		}
		
		
		System.out.println(list);
	}

}
