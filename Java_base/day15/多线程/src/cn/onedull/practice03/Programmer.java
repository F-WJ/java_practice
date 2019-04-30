package cn.onedull.practice03;

public class Programmer {
	private int netInCome;


	public Programmer() {
		super();
	}

	public Programmer(int netInCome) {
		super();
		this.netInCome = netInCome;
	}

	public int getNetInCome() {
		return netInCome;
	}

	public void setNetInCome(int netInCome) {
		this.netInCome = netInCome;
	}
	
	//吃饭
	public void eat(int money) {
		netInCome = netInCome - money;
	}
	//交房租
	public void payRent(int money) {
		netInCome = netInCome - money;
	}
	//看电影
	public void seeMovie(int money) {
		netInCome = netInCome - money;
	}
}


/*
 * 定义一个程序猿类 Programmer，有一个私有的 int 类型的字段余额 netInCome， 
 * 有 3 个方法：吃饭 eat、交房租
 * payRent、看电影 seeMovie。 这 3 个方法都接收有一个 int 类型的参数 money 
 * 表示消费金额，用于对余额做减法运算。
 **/