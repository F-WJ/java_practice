package test.test2;

public class ExceptionTest {

	public static void main(String[] args) {
		int number = 0;
	
		System.out.println(returnTest(number));

	}
	
	
	
	private static int returnTest(int number) {
		try {
			System.out.println("try: " + number);
			return number++;
		}catch(Exception ignored) {
			
		}finally {
			System.out.println("finally: " + number);
			return ++number;
		}
		
	}

}

/*
�������

1.���֪ʶ����֮ǰ����ϰ��������try catch finally��
Ҳ֪���������Ƿ񲶻��쳣����ִ��finally��䣬��ô��try��finallyͬʱreturnʱ��
����ʲô����˳���ء�
��try����return������finallyʱ������ִ��return֮�����䵫�����أ�
ִ����finally�е������return�����finally�����Ҳ��return��
��ֱ��ͨ��finally��return��䷵�ء�

2.Դ�����
������һ�����ͱ���number����ʼֵΪ0
returnTest�����������number���������ķ���ֵ���
returnTest����try�������з���number++
catch��ʲôҲ����
finally�з��� ++number��

3.�𰸽���
ִ��tryʱ�Ƚ�number��Ϊ1��֮��finally��number��Ϊ2�����շ���2
������2
*/
