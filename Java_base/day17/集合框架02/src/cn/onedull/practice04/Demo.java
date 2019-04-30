/*
1) ����һ��List����List �������������ˣ�������Ϣ���£�
�������乤��
zhang3 18 3000
li4 25 3500
wang5 22 3200
2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��
������zhao6�����䣺24������3300
3) ɾ��wang5 ����Ϣ
4) ����for ѭ����������ӡList �����й��˵���Ϣ
5) ���õ�����������List �����еĹ��˵���work ������
6) ΪWorker ����дequals �����������������䡢����ȫ�����ʱ��ŷ���true

����:
(1)����Worker��, ��Ա��������name(String����), ����age(int����), ����salary(double)
	��Ա����work(), ����equals()
(2)���������Demo, ����ArrayList����
(3)����add�������Worker����
(4)����, �鿴���

�ܽ�:
(1)ͨ��equals��������

*/
package cn.onedull.practice04;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		//����ArrayList����
		ArrayList<Worker> list = new ArrayList<Worker>();
		//���Worker����
		list.add(new Worker("zhang3", 18, 3000));
		list.add(new Worker("zhang3", 18, 3000));  //����
		list.add(new Worker("li4", 25, 3500));
		list.add(new Worker("wang5", 22, 3200));
		
		
		//��li4 ֮ǰ����һ������
		int size = 0;
		for(Worker worker : list ) {
			if("li4".equals(worker.getName())){
				
				size = list.indexOf(worker);
				break;
			}
		}
		list.add(size + 1, new Worker("zhao6", 24, 300));
		
		//forѭ��
		for(Worker ele : list) {
			System.out.println(ele);
		}
		
		//��������
		Iterator<Worker> it = list.iterator();
		while(it.hasNext()) {
			it.next().work();;
		}
		
		//��ӡ
		System.out.println(list);
	}

}
