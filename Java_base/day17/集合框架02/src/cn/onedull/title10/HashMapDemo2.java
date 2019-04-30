/*
����ͳ��һ���ַ�����ÿ���ַ����ִ���

����:
(1)�ȴ���HashMap����
(2)����forѭ����HashMap��containsKey�������жϼ����Ƿ����ĳһ����, ������ھ����

�ܽ�:
(1)��������HashMap��containsKey�����ж��Ƿ����ظ����ݵĲ���
*/
package cn.onedull.title10;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		//����HashMap����
		HashMap<Character,Integer> map = new HashMap<>();
		
		String text = "��������,����ɡҲû������";
		//forѭ��
		for(int i = 0 ; i<text.length();i++){
			char c = text.charAt(i);
			if(map.containsKey(c)){
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			}else{
				map.put(c, 1);
			}
			
		}
		//��ӡ
		System.out.println(map);
	}

}
