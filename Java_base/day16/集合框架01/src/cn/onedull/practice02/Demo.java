/*
������Student ���󣬶����а���������name�������䣨age�����ɼ���score�����༶��
��classNum���ȳ�Ա���������У�classNum ��ʾѧ���İ�ţ����硰class05����
ѧ����Ϣ���������£�
�����������ɼ��༶�������������ɼ��༶��
1 Tom 18 100 class05 4 Jim 30 80 class05
2 Jerry 22 70 class04 5 Steve 28 66 class06
3 Owen 25 90 class05 6 Kevin 24 100 class04
�����ѧ����Ϣ���������Ҫ��
1������ArrayList ����studList��������ѧ����Ϣ�����ѧ�����ݡ�
2���޸�Jerry �ĳɼ���70 �޸�Ϊ90��
3��ɾ��Kevin ��һ��ѧ�����ݡ�
4������class05 �༶��ƽ���֡�����������

����:
(1)����ѧ����Student, ��Ա��������name(String), ����age(int), �ɼ�score(int), �༶��classNum(Stirng)
(2)��main��������ArrayList����, ����add�������Student����


�ܽ�:
(1)ͨ��ArrayList���size������֪���б��Ԫ����
*/
package cn.onedull.practice02;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30, 80, "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		
		//�޸�Jerry�ĳɼ�Ϊ90
		for(int i = 0; i < list.size(); i++) {
			if("Jerry".equals(list.get(i).getName())) {
				list.get(i).setScore(90);
			}
		}
		System.out.println(list);
		
		//ɾ��Kevin����
		for(int i = 0; i < list.size(); i++) {
			if("Jerry".equals(list.get(i).getName())) {
				list.remove(i);
			}
		}
		//System.out.println(list);
		
		
		//����class05�༶��ƽ����
		double sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i).getScore();
		}
		double average = sum / list.size();
		System.out.println("ƽ����: " + average);
	}

}
