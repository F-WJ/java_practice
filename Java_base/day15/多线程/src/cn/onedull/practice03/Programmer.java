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
	
	//�Է�
	public void eat(int money) {
		netInCome = netInCome - money;
	}
	//������
	public void payRent(int money) {
		netInCome = netInCome - money;
	}
	//����Ӱ
	public void seeMovie(int money) {
		netInCome = netInCome - money;
	}
}


/*
 * ����һ������Գ�� Programmer����һ��˽�е� int ���͵��ֶ���� netInCome�� 
 * �� 3 ���������Է� eat��������
 * payRent������Ӱ seeMovie�� �� 3 ��������������һ�� int ���͵Ĳ��� money 
 * ��ʾ���ѽ����ڶ�������������㡣
 **/