/*
2:String[] str = {"1+2","1+2","23+34","12+1+1+1"};
 ���� str���������� ��ֵ�� ��
  
����:
(1)����һ��String���������һ��int���ͱ���sum
(2)����forѭ����String���split����, ���ÿ������
(3)����Integer���parseInt����, ���ַ���ת��Ϊint����

�ܽ�:
(1)split��subring�������ӱ���
*/
package cn.onedull.string02;

public class Demo {

	public static void main(String[] args) {
		//�����ַ���  
		String[] str = {"1+2","1+2","23+34","12+1+1+1"};
		//�ܺ�
		int sum = 0;
		//forѭ��
		for(String ele : str) {
			for(String num : ele.split("\\+")){
				sum = sum + Integer.parseInt(num);
			}
		}
		System.out.println(sum);
		
	}

}
