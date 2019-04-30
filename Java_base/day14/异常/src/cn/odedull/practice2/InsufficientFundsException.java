package cn.odedull.practice2;
/**
 * 取款的数额不能大于存款
 * @author FWJ
 *
 */
public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
