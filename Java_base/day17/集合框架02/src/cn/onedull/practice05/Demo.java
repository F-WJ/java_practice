/*
��֪java ѧԺ�̿����ݰ�������
��ʦ�γ�
stef p2p
will javaWeb
neld springmvc
hesj wms
bunny javaWeb
hhaiy javaSe


Ҫ��
1��ʹ��Map�� ����ʦ����Ϊkey �γ���Ϊvalue�� ��ɿγ̰���
2�����һ������ʦdafei ��jdbc
3��hhaiy ��Ϊ��javaWeb
4�����������ʦ���Լ���ʦ���ڿγ�
5��������н�javaWeb ����ʦ

����:
(1)����HashMap����
(2)����put�����������
(3)����replace�޸�ĳһkey��Ӧ��value
(4)����entrySet������for������������

�ܽ�:
(1)�޸�ĳһkey��Ӧ��ֵ, ����ʹ��replace, ������ǰ��д�ж��Ƿ����
*/
package cn.onedull.practice05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		//����Map����
		HashMap<String, String> map = new HashMap<String, String>();
		//�������
		map.put("stef", "p2p");
		map.put("will", "javaWeb");
		map.put("neld", "springmvc");
		map.put("hesj", "wms");
		map.put("bunny", "javaWeb");
		map.put("hhaiy", "javaSe");
		
		map.put("defei", "jdbc");
		
		//�޸�
		//if(map.containsKey("hhaiy")) {
		map.replace("hhaiy", "javaWeb");
		//}
		
		//���������ʦ�γ���Ϣ
		Set<Entry<String, String>> all = map.entrySet();
		Iterator<Entry<String, String>> it = all.iterator();
		while(it.hasNext()) {
			Entry<String, String> e = it.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("----------------------------");
		//������н�javaWeb����ʦ
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry<String, String> ele : entry) {
		
			if("javaWeb".equals(ele.getValue())) {
				System.out.println(ele.getKey());
			}
			
		}
	}

}
