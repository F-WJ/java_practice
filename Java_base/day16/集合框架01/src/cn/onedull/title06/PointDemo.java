/*
���󣺶���һ��Point �࣬��ΪPoint �ඨ�巺�ͺ�ʹ�÷���

����:
(1)����Point��, ���Ͷ��巺��
(2)��main�����д���Point����

�ܽ�:
(1)
*/
package cn.onedull.title06;

public class PointDemo {

	public static void main(String[] args) {
		//����Point����
		Point<String> point = new Point<String>();
		point.setName("С��");
	}

}


class Point<E> {
	private E name;
	
	public Point() {
		
	}
	
	
	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
}
