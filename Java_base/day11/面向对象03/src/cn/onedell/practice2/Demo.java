/*
ĳ��˾�����������ͺţ�model�������ˣ�Roboot�� A ��B��C�����Ƕ���������name, ��
��model ����·����walk������A ʵ����˵������speak ��B ʵ����ͼ��ʶ����see��
C ͬʱʵ����˵����ʶ���ܡ������ü̳С��ӿڡ���̬��֪ʶ��������Ʋ���д����
Demo

����:
(1)����һ���ӿ�ISkill, �̳нӿ�IWalk(��·), ISpeak(˵��), ͼ��ʶ��(ISee)
(2)����ʵ����
(3)����������(Demo), ���÷���, ��ӡ���

�ܽ�:
(1)һ��ʹ�ýӿ�, �޷�ʹ�ýӿ�û�еķ���, ͨ���̳и���Ҳ����
 */
package cn.onedell.practice2;

public class Demo {

	public static void main(String[] args) {
		ISkill skill = new Skill();
		Roboot roboot1 = new Roboot();
		roboot1.setName("A");
		roboot1.setmodel("model");
		System.out.println(roboot1.getModel() + " , " + roboot1.getName());
		skill.speak();
		
		System.out.println("-------------------------");
		Roboot roboot2 = new Roboot();
		roboot2.setName("B");
		roboot2.setmodel("model");
		System.out.println(roboot2.getModel() + " , " + roboot2.getName());
		skill.see();
		
		System.out.println("--------------------------");
		Roboot roboot3 = new Roboot();
		roboot3.setName("C");
		roboot3.setmodel("model");
		System.out.println(roboot3.getModel() + " , " + roboot3.getName());
		skill.speak();
		skill.see();
		
		
		
	}

}
