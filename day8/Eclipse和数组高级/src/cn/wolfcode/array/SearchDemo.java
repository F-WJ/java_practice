/*
 	�����ַ�����char[] arr={��A��,��1��,��R��,��!��,��e��,��&��,��A��,��5��,��A��,��g��,��#��,��D��}����ʹ��ѭ����ͳ�Ƴ�����Ӣ����
	ĸ��A���ĸ�����
	����:
	(1)����һ��char��������arr
	(2)ʹ��for+if����ж�Ԫ���Ƿ�Ϊ'A'
	
	�ܽ�:
	(1)��char������, 65�ȼ���'A'
 */
package cn.wolfcode.array;

public class SearchDemo {

	public static void main(String[] args) {
		//����char���Ͳ���̬��ʼ��
		char[] arr = new char[]{'A', '1', 'R' , '!' , 'e' , '&' , 'A' , '5' , 'A' , 'g' , '#' , 'D', 'a'};
		//for
		int sum = 0;
		for(char ele : arr)
		{
			//'A'�ȼ���65
			if(ele == 65)
			{
				sum++;
			}
		}
		System.out.println(sum);

	}

}
