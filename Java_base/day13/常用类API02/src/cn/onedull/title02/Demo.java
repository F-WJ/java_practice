/*
ʹ�������Random �࣬ͨ��Random ���ȡα�����

����:
(1)����Random���е�nextInt����


�ܽ�:
(1)Random����Ҫ��������α�����.
*/
package cn.onedull.title02;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100);   //100���������
		System.out.println(num);
	}

}
