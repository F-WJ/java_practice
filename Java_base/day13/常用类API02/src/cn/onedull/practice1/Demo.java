/*���ýӿڵ�֪ʶ��д����������������������ļӼ��˳�����

����:
1������һ���ӿ�Compute ����һ������int computer(int n,int m);
2������ӣ�Add��������Subtract�����ˣ�Multiply��������Divide���ĸ���,�ֱ�ʵ�ִ˽�
�ڣ����ֱ𸲸�computer ������ɼӼ��˳�����
3�����һ����UseCompute�����з�����public void useCom(Compute com, int num1,int
num2)
�˷���Ҫ���ܹ���
1���ô��ݹ����Ķ������computer �����������
2���������Ľ��
4�����һ�������࣬����UseCompute �еķ���useCom ����ɼӼ��˳�����

�ܽ�:
(1)����Ϊ�����Ĳ���, ���ݵ�����ĵ�ֵַ
*/
package cn.onedull.practice1;


public class Demo {
	public static void main(String[] args) {
		//���÷���
		UseCompute uc = new UseCompute();
		//���÷���
		uc.useCom(new Add(), 4, 5);       //��
		uc.useCom(new Divide(), 4, 5);    //��
		uc.useCom(new Multiply(), 4, 5);  //��
		uc.useCom(new Subtract(), 4, 5);  //��
   	}

	
	
	
}
