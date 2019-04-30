/*建立银行账户类（Account），类中有变量double balance 表示存款，Account 类的构造
方法能初始化账户余额，Account 类中有取款的方法withDrawal(double dAmount)，当取款的
数额大于存款时，抛出自定义的InsufficientFundsException，当取款数额为负数，抛出自定
义的NagativeFundsException。
如new Account(100)，表示当前余额100 元，当调用方法withdrawal(150)，withdrawal(-15)
时会抛出自定义异常。

步骤:
(1)定义一个自定义异常类InsufficientFundsException, 继承RuntimeException, 定义有参构造器
(2)定义一个银行账号类(Account), 定义一个private修饰double类型balance类型变量,
	定义一个withDrawal方法, 用来做存款操作, 设置throw异常.
(3)定义测试类Demo, 创建Account对象, 调用存款方法, 测试

总结:
(1)使用throws抛出异常,  提醒调用者, 此方法可能会出现异常
*/
package cn.odedull.practice2;

public class Demo {

	public static void main(String[] args) throws InsufficientFundsException, NagativeFundsException {
		Account account = new Account(50);
		account.withDrawal(-30);
	}

}
