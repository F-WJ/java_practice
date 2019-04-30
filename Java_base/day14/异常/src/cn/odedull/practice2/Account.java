package cn.odedull.practice2;

public class Account {
	private double balance;    //���
	
	public Account() {
		balance = 0; //��ʼ��
	}
	public Account(double balance) {
		this.setBalance(balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//ȡ���
	public void withDrawal(double dAmount) throws InsufficientFundsException, NagativeFundsException{
		if(dAmount > balance) {
			throw new InsufficientFundsException("����");
	}
		if(dAmount < 0) {
			throw new NagativeFundsException("ȡ�������Ϊ����");
		}
	}
}


/*���������˻��ࣨAccount���������б���double balance ��ʾ��Account ��Ĺ���
�����ܳ�ʼ���˻���Account ������ȡ��ķ���withDrawal(double dAmount)����ȡ���
������ڴ��ʱ���׳��Զ����InsufficientFundsException����ȡ������Ϊ�������׳��Զ�
���NagativeFundsException��
��new Account(100)����ʾ��ǰ���100 Ԫ�������÷���withdrawal(150)��withdrawal(-15)
ʱ���׳��Զ����쳣��
*/