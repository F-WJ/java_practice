package cn.onedull.practice1;

public class UseCompute {
	public void useCom(Compute com, int num1, int num2) {
		//���÷���
		int value = com.computer(num1, num2);
		//��ӡ���
		System.out.println(value);
	}
}


/*
 * 3�����һ����UseCompute�����з�����public void useCom(Compute com, int num1,int num2)
 * �˷���Ҫ���ܹ���1���ô��ݹ����Ķ������computer ����������� 2���������Ľ��
 */