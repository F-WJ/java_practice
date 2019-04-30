package cn.odedull.practice2;

public class Account {
	private double balance;    //存款
	
	public Account() {
		balance = 0; //初始化
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
	
	//取款方法
	public void withDrawal(double dAmount) throws InsufficientFundsException, NagativeFundsException{
		if(dAmount > balance) {
			throw new InsufficientFundsException("存款不足");
	}
		if(dAmount < 0) {
			throw new NagativeFundsException("取款数额不能为负数");
		}
	}
}


/*建立银行账户类（Account），类中有变量double balance 表示存款，Account 类的构造
方法能初始化账户余额，Account 类中有取款的方法withDrawal(double dAmount)，当取款的
数额大于存款时，抛出自定义的InsufficientFundsException，当取款数额为负数，抛出自定
义的NagativeFundsException。
如new Account(100)，表示当前余额100 元，当调用方法withdrawal(150)，withdrawal(-15)
时会抛出自定义异常。
*/