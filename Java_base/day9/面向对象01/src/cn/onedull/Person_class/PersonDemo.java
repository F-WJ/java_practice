/*
2. ����������Ϣ�������ഴ������
�����
�ֶΣ�name��age������(weapon)��������(formula)
��������ի(doMaigre)�����(buddha)��ȡ��(doPilgrimage)��ս��(fight), ����exterminate devil
--> (extDevil)
��˽�
�ֶΣ�name��age������,ϱ��(wife)��
���������ȡ����ս��, ǣ��holding horses ---> (holdHorse)
ɳ����
�ֶΣ�name��age������, ��ɳ��(sandRiver)��
����:���ȡ����ս��, ������Pick up the luggage --> pickUpLuge

����:
(1)����һ����(��������)
(2)������������
(3)ʹ��setter������ֵ
(4)�������跽��

�ܽ�:
(1)��װ�����˴�����ظ���.
 */
package cn.onedull.Person_class;

public class PersonDemo {
	public static void main(String[] args){
		//����monkey����
		Animal monkey = new Animal();
		monkey.setName("�����");
		monkey.setAge(999);
		monkey.setWeapon("");
		monkey.doMaigre();
		monkey.buddha();
		monkey.doPilgrimage();
		monkey.fight();
		monkey.extDevil();
		
		//��������
		Animal pig = new Animal();
		pig.setName("��˽�");
		pig.setAge(999);
		pig.setWeapon("");
		pig.buddha();
		pig.doPilgrimage();
		pig.fight();
		pig.holdHorse();
		
		//��������
		Animal fish = new Animal();
		fish.setName("ɳ����");
		fish.setAge(999);
		fish.setWeapon("");
		fish.doPilgrimage();
		fish.fight();
		fish.pickUpLuge();
			
		
	}
}
