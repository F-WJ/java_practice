/*
����ʹ�õ������ģʽ����һ������Ĺ����࣬������

����:
(1)����һ��ArrayUtil������, ˽�л�������, ����һ������, ����һ�����������ض����������ʹ��
(2)����һ��������Demo, ֱ��ʹ����������getUtil����

�ܽ�:
(1)����ģʽ���, Ҫ��ס˽�л�������, ��������Ķ����ʱ��, Ҫ˽��, ��̬����,
	������ʹ��public����, ������Ϊ���ظ������.
*/
package cn.onedull.title02;

public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 4, 5, 6};
		//���÷���
		String str = ArrayUtil.getUtil().toString(arr);
		System.out.println(str);
	}

}
