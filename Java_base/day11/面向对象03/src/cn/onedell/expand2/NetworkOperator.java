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
	
	//��װ���
	void installBroadband() {
		System.out.println("��װ���");
	}
	//��װ���ߵ���
	void installCableTV() {
		System.out.println("��װ���ߵ���");
	}
	
	//��������
	void type(IType t) {
		t.type();
	}
	
	//����
	void function(IFunction f) {
		f.function();
	}
}


/*
�����й�����(ChinaTelecom),�й��ƶ�(ChinaMobile),�й���ͨ(ChinaUnicom) ���Ƕ���
��������Ӫ��(NetworkOperator),���и��Ե���������(type),�����й����ŵ���������Ϊ
LTE,�й��ƶ�����������ΪTD-LTE,�й���ͨ����������ΪWCDMA.������Ӫ�̶��а�װ��
��(installBroadband)�Ͱ�װ���ߵ���(installCableTV)����Ϊ.��ʵ��������(IInternet)
�ʹ�绰(ICall)�Ĺ���,����,�й��ƶ�ͨ������ʵ��������(IChat)�Ĺ���.
Ҫ��ʹ�ü̳�֪ʶģ���������Ӫ�̵Ĺ�ϵ��ʹ�ýӿ�ʵ�ֹ��ܹ�ϵ

�ӿ��������� lte td-lte  wcdma
���� ��� �绰 
 */