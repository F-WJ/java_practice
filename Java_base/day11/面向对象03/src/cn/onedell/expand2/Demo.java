/*
现有中国电信(ChinaTelecom),中国移动(ChinaMobile),中国联通(ChinaUnicom) 他们都属
于网络运营商(NetworkOperator),都有各自的网络类型(type),比如中国电信的网络类型为
LTE,中国移动的网络类型为TD-LTE,中国联通的网络类型为WCDMA.网络运营商都有安装宽
带(installBroadband)和安装有线电视(installCableTV)的行为.都实现了上网(IInternet)
和打电话(ICall)的功能,此外,中国移动通过飞信实现了聊天(IChat)的功能.
要求：使用继承知识模拟各网络运营商的关系，使用接口实现功能关系

接口网络类型 lte td-lte  wcdma
方法 宽带 电话 

步骤:
(1)网络类型一个通用接口类, 功能有一个通用接口接
(2)创建一个运营商类, 调用网络和接口
 */
package cn.onedell.expand2;

public class Demo {

	public static void main(String[] args) {
		//lte网络
		IType lte = new Lte();
		//td-lte
		IType tdlte = new Tdlte();
		//wcdma
		IType wcdma = new Wcdma();
		IFunction internet = new Internet();
		IFunction call = new Call();
		IFunction chat = new Chat();
		//
		NetworkOperator a = new NetworkOperator();
		a.setName("中国电信");
		a.type(lte);
		a.installBroadband();
		a.installCableTV();
		a.function(internet);
		a.function(call);
		
		System.out.println("---------------------------");
		
		NetworkOperator b = new NetworkOperator();
		b.setName("中国联通");
		b.type(wcdma);
		b.installBroadband();
		b.installCableTV();
		b.function(internet);
		b.function(call);
		
		System.out.println("---------------------------");
		
		NetworkOperator c = new NetworkOperator();
		c.setName("中国移动");
		c.type(tdlte);
		c.installBroadband();
		c.installCableTV();
		c.function(internet);
		c.function(call);
		c.function(chat);
		
		System.out.println("---------------------------");
		
	}

}
