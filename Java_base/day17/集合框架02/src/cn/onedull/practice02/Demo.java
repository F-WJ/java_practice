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
4������class05 �༶��ƽ���֡�

����:
(1)����Student��, ��Ա��������name(String), ����age(int����),  �ɼ�score(double����), �༶��classNum(String)
(2)���������Demo, ����ArrayList, ����add�������student����
(3)����remove����ɾ��ĳһѧ������
(4)ͨ��forѭ�������б�Ԫ��, ������class05ƽ����

�ܽ�:
(1)ArrayList��Ӷ����ʱ��, ֻ����Ӷ�����ڴ��ַ
*/
package cn.onedull.practice02;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<Student> list = new ArrayList<Student>();
		
		//�������
		 list.add(new Student("Tom", 18, 100, "class05"));
		 list.add(new Student("Jerry", 22, 70, "class04"));
		 list.add(new Student("Owen", 25, 90, "class05"));
		 list.add(new Student("Jim", 30, 80, "class05"));
		 list.add(new Student("Steve", 28, 66, "class06"));
		 list.add(new Student("Kevin", 24, 100, "class04"));
		 
		 //�޸�Jerry �ĳɼ���70 �޸�Ϊ90
		 for(int i = 0; i < list.size(); i++) {
			 if("Jerry".equals(list.get(i).getName())){
				 list.get(i).setScore(90);
			 }
		 }
		 
		 //ɾ��Kevin ��һ��ѧ������
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			//Student st = it.next();
			if("Kevin".equals(it.next().getName())) {
				it.remove();
			}
		}
		
		System.out.println(list);
		
		//����class05 �༶��ƽ����
		double average = 0;
		int time = 0;
		for(Student st : list) {
			if("class05".equals(st.getClassNum())){
				average = average + st.getScore();
				time++;
			}
		}
		System.out.println("class05�༶ƽ����" + (average / time));
	}

}
