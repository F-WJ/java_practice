/*
ͽ��
�����
�ֶΣ�name��age������(weapon)
��������ի(doMaigre)�����ȡ��(doPilgrimage)��ս��(fight), ����exterminate devil
--> (extDevil)
��˽�
�ֶΣ�name��age������
���������ȡ����ս��, ǣ��holding horses ---> (holdHorse)
ɳ����
�ֶΣ�name��age������
����:���ȡ����ս��, ������Pick up the luggage --> pickUpLuge
Ҫ��
1������������Ϣ�����뻯(�õ�֪ʶ�㣺1��this 2��super 3��javabean 4���̳�)��
2��д������Test ����
3�����һ���ľ���(���ⷢ��)��

����:
(1)����һ��(Person)��(��������), ��Ա������name��age������(weapon),��Ա���������(buddha)��ȡ��(doPilgrimage)��ս��(fight)
(2)����һ������(Prentice), ��Ա�����н���(extDevil), ��ի(doMaigre), ǣ��(holdHorse), ������(pickUpLuge)
(3)����������, �ֱ𴴽�����Prentice����, ������ֵ, ���÷���, ��ӡ���


�ܽ�:
(1)���ü̳�extends, ���Լ��������ظ�ֵ����
(2)super.������, ����ø���ĳ�Ա����
 */
package cn.onedull.practice1;



public class PrenticeDemo {

	public static void main(String[] args) {
		Prentice prentice1 = new Prentice();
		prentice1.setName("�����");
		prentice1.setAge(999);
		prentice1.setWeapon("�𹿰�");
		prentice1.message();
		prentice1.doPilgrimage();
		prentice1.buddha();
		prentice1.doMaigre();
		prentice1.fight();
		prentice1.extDevil();
		
		
		System.out.println("\n" + "----------------------");
		
		Prentice prentice2 = new Prentice();
		prentice2.setName("��˽�");
		prentice2.setAge(1299);
		prentice2.setWeapon("�ųݶ���");
		prentice2.message();
		prentice2.doPilgrimage();
		prentice2.buddha();
		prentice2.fight();
		prentice2.holdHorse();
		        
		System.out.println("\n" + "----------------------");
		
		Prentice prentice3 = new Prentice();
		prentice3.setName("ɳ����");
		prentice3.setAge(799);
		prentice3.setWeapon("��������");
		prentice3.message();
		prentice3.doPilgrimage();
		prentice3.buddha();
		prentice3.fight();
		prentice3.pickUpLuge();
		
		System.out.println("\n" + "----------------------");
		//����
		System.out.print(prentice2.getName());
		prentice2.extDevil();
		System.out.print(prentice1.getName());
		
		
	}

}
