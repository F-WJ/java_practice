/*
1:String str = "����;����;�ŷ�;�ܲ�;�ĺ�";
  ��str�е�������ó���,�ҳ������м�������������
  
����:
(1)�ȶ����String���ַ���, ����һ��int���ͱ���time
(2)����String���split��������ַ���, ͨ��forѭ����if�ж���λ�����Ƿ�Ϊ��.

�ܽ�:
(1)����String���split����, ���ٴ�����.
*/
package cn.onedull.string01;

public class Demo {

	public static void main(String[] args) {
		//����String��
		String str = "����;����;�ŷ�;�ܲ�;�ĺ�";
		int time = 0;
		//split����
		String[] str2 = str.split(";");
		for(String ele : str2) {
			if("��".equals(ele.substring(0, 1))) {
				time++;
			}
		}
		System.out.println(time);
	}

}
