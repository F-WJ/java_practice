/*
������ʾ�����쳣throw ��ʹ��


����:
(1)����һ��setAge����,  ����if�ж�, ��������������18�Ļ�, �׳��쳣
(2)��main������������try-catch�쳣

�ܽ�:
(1)throw������, ����������ֵ��쳣, �����봦������쳣, ֱ������throw�׳���������
*/
package cn.odedull.title4;

public class ThrowTest {

	public static void main(String[] args){
		int age = 50;
		try {
			setAge(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void setAge(int age) throws Exception{
		if(age < 18) {
			throw new Exception("���ܵ���18");
		}
	}

}
