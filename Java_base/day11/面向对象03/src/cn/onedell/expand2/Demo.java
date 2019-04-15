/*
�����й�����(ChinaTelecom),�й��ƶ�(ChinaMobile),�й���ͨ(ChinaUnicom) ���Ƕ���
��������Ӫ��(NetworkOperator),���и��Ե���������(type),�����й����ŵ���������Ϊ
LTE,�й��ƶ�����������ΪTD-LTE,�й���ͨ����������ΪWCDMA.������Ӫ�̶��а�װ��
��(installBroadband)�Ͱ�װ���ߵ���(installCableTV)����Ϊ.��ʵ��������(IInternet)
�ʹ�绰(ICall)�Ĺ���,����,�й��ƶ�ͨ������ʵ��������(IChat)�Ĺ���.
Ҫ��ʹ�ü̳�֪ʶģ���������Ӫ�̵Ĺ�ϵ��ʹ�ýӿ�ʵ�ֹ��ܹ�ϵ

�ӿ��������� lte td-lte  wcdma
���� ��� �绰 

����:
(1)��������һ��ͨ�ýӿ���, ������һ��ͨ�ýӿڽ�
(2)����һ����Ӫ����, ��������ͽӿ�
 */
package cn.onedell.expand2;

public class Demo {

	public static void main(String[] args) {
		//lte����
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
		a.setName("�й�����");
		a.type(lte);
		a.installBroadband();
		a.installCableTV();
		a.function(internet);
		a.function(call);
		
		System.out.println("---------------------------");
		
		NetworkOperator b = new NetworkOperator();
		b.setName("�й���ͨ");
		b.type(wcdma);
		b.installBroadband();
		b.installCableTV();
		b.function(internet);
		b.function(call);
		
		System.out.println("---------------------------");
		
		NetworkOperator c = new NetworkOperator();
		c.setName("�й��ƶ�");
		c.type(tdlte);
		c.installBroadband();
		c.installCableTV();
		c.function(internet);
		c.function(call);
		c.function(chat);
		
		System.out.println("---------------------------");
		
	}

}
