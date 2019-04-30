/*设计一个方法getCpCode(double orderFee,String province) 并且在main 方法中调用,打印出
getCpCode(80,”北京市”)的返回结果.
根据订单金额orderFee 和收货人省份province 来判断使用哪家快递公司,具体需求如下
如果订单金额在128 以上或者是广东省的收货地址,直接使用顺丰包邮, 返回字符串“SF”,
如果订单金额在58 以上并且是北京市的收货地址,直接使用EMS 包邮,返回字符串”EMS”,
其他情况默认为中通快递,返回字符串”ZTO”

步骤:
(1)定义一个Demo类, 设计一个getCpCode方法
(2)利用if语句和String类的quals方法来判断使用哪个快递公司

总结:
(1)判断两个字符串是否相等的时候, 使用equals方法, 不要使用==, ==是判断地址值的
*/
package cn.onedull.practice3;

public class Demo {
	public static void main(String[] args) {
		String exp = Demo.getCpCode(9, "广东省");
		System.out.println(exp);
	}
	
	static String getCpCode(double orderFee,String province) {
		if(orderFee > 128 || "广东省".equals(province.trim())) {
			return "SF";
		}
		else if(orderFee < 58 && "北京市".equals(province.trim())) {
			return "EMS";
		}
		else {
			return "ZTO";
		}
	}
}
