package cn.odedull.practice2;
/**
 * 取款的数额不能为负数
 * @author FWJ
 *
 */
public class NagativeFundsException extends Exception{
	public NagativeFundsException(String message) {
		super(message);
	}
}
