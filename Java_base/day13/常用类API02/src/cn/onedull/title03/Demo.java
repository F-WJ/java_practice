/*
����
ʹ�������UUID �࣬ͨ��UUID ���ȡ�����
ͨ��UUID �࣬��ȡ��֤��

����:
(1)����UUID���randomUUID����

�ܽ�:
(1)����������֤��ʹ��
*/
package cn.onedull.title03;

import java.util.UUID;

public class Demo {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString().substring(0, 4);
		System.out.println(uuid);
	}

}
