package cn.onedell.expand2;

public class NetworkOperator {
	private String name;
	
	public NetworkOperator() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//安装宽带
	void installBroadband() {
		System.out.println("安装宽带");
	}
	//安装有线电视
	void installCableTV() {
		System.out.println("安装有线电视");
	}
	
	//网络类型
	void type(IType t) {
		t.type();
	}
	
	//功能
	void function(IFunction f) {
		f.function();
	}
}


/*
现有中国电信(ChinaTelecom),中国移动(ChinaMobile),中国联通(ChinaUnicom) 他们都属
于网络运营商(NetworkOperator),都有各自的网络类型(type),比如中国电信的网络类型为
LTE,中国移动的网络类型为TD-LTE,中国联通的网络类型为WCDMA.网络运营商都有安装宽
带(installBroadband)和安装有线电视(installCableTV)的行为.都实现了上网(IInternet)
和打电话(ICall)的功能,此外,中国移动通过飞信实现了聊天(IChat)的功能.
要求：使用继承知识模拟各网络运营商的关系，使用接口实现功能关系

接口网络类型 lte td-lte  wcdma
方法 宽带 电话 
 */