/*4:��֪�ַ��� String str = "12,334,566547,3132,56,76,312";
  ͳ���ַ����� ��λ�Ͱ�λ�ϵ�ֵ ��ӵĽ���� 10 ������.
  ����:      129   1456 ����������
  
 ����:
(1)�����ַ�������
(2)����for��substring������ɸѡ����λ�Ͱ�λ��ֵ�����10 ����

�ܽ�:
(1)�о���������������
 */
package cn.onedull.string04;

public class Demo {

	public static void main(String[] args) {
		//����String���Ͷ���
		String str = "12,334,566547,3132,56,76,312, 129";
		//split
		for(String ele : str.split(",")) {
			if(ele.length() >= 3) {
				int sum = Integer.parseInt(ele.substring(ele.length() - 1)) + Integer.parseInt(ele.substring(ele.length() - 3, ele.length() - 2));
				if(sum == 10) {
					System.out.println(ele);
				}
			}
		}
	}

}
