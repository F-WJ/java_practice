/*���������˻��ࣨAccount���������б���double balance ��ʾ��Account ��Ĺ���
�����ܳ�ʼ���˻���Account ������ȡ��ķ���withDrawal(double dAmount)����ȡ���
������ڴ��ʱ���׳��Զ����InsufficientFundsException����ȡ������Ϊ�������׳��Զ�
���NagativeFundsException��
��new Account(100)����ʾ��ǰ���100 Ԫ�������÷���withdrawal(150)��withdrawal(-15)
ʱ���׳��Զ����쳣��

����:
(1)����һ���Զ����쳣��InsufficientFundsException, �̳�RuntimeException, �����вι�����
(2)����һ�������˺���(Account), ����һ��private����double����balance���ͱ���,
	����һ��withDrawal����, ������������, ����throw�쳣.
(3)���������Demo, ����Account����, ���ô���, ����

�ܽ�:
(1)ʹ��throws�׳��쳣,  ���ѵ�����, �˷������ܻ�����쳣
*/
package cn.odedull.practice2;

public class Demo {

	public static void main(String[] args) throws InsufficientFundsException, NagativeFundsException {
		Account account = new Account(50);
		account.withDrawal(-30);
	}

}
