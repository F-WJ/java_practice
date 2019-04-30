/*
���󣺵���HashMap �ĳ��÷���

��Ӳ���
boolean put(Object key,Object value)���洢һ����ֵ�Ե�Map ��
boolean putAll(Map m)����m �е����м�ֵ����ӵ���ǰMap ��

ɾ������
Object remove(Object key)����Map ��ɾ��ָ��key �ļ�ֵ�ԣ������ر�ɾ��key ��Ӧ��value

�޸Ĳ���
��ר�ŵķ��������Ե���put �������洢��ͬkey����ͬvalue �ļ�ֵ�ԣ����Ը���ԭ���ġ�

��ѯ����
int size()�����ص�ǰMap �м�ֵ�Ը���
boolean isEmpty()���жϵ�ǰMap �м�ֵ�Ը����Ƿ�Ϊ0.
Object get(Object key)������Map ��ָ��key ��Ӧ��value ֵ����������ڸ�key������null
boolean containsKey(Object key):�ж�Map ���Ƿ����ָ��key
boolean containsValue(Object value):�ж�Map ���Ƿ����ָ��value
Set keySet()������Map ������key ����ɵ�Set ����
Collection values()������Map ������value ����ɵ�Collection ����
Set<Entry> entrySet()������Map �����м�ֵ������ɵ�Set ����

�ܽ�:
(1)����entrySet������ʱ��, ע�����͵�д��Set<Entry<K, V>>
*/
package cn.onedull.title08;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//��Ӳ���
		//�洢һ����ֵ��
		map.put("����һ", "С��");
		map.put("���ڶ�", "����");
		map.put("������", "����");
		map.put("������", "����");
		map.put("������", "�ش���");
		//��Map m�����м�ֵ����ӵ���ǰMap��
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("��ĩ", "���˳���");
		map.putAll(m);
		System.out.println(map);
		
		System.out.println("-------------");
		
		//ɾ������
		String value = map.remove("��ĩ");
		System.out.println(value);
		System.out.println(map);
		
		//�޸ķ���(ֱ�Ӹ���)
		//�滻ֵ
		map.replace("����һ", "��");
		
		System.out.println("---------------");
		//��ѯ����
		//���ص�ǰMap�м�ֵ�Ը���
		int size = map.size();
		System.out.println(size);
		//�жϵ�ǰMap��ֵ�Ը����Ƿ�Ϊ0.
		boolean s = map.isEmpty();
		System.out.println(s);
		//����Map��ָ��key��Ӧ��valueֵ, ��������ڷ���null
		System.out.println(map.get("����һ"));
		//�ж�Map���Ƿ����ָ��key
		boolean k = map.containsKey("����һ");
		System.out.println(k);
		//�ж�Map���Ƿ����ָ��value
		boolean v = map.containsValue("��");
//		System.out.println
		
		
		

	}

}
