/*
���󣺶���һ�������ࣨFrog���̳��ڶ����ࣨAnimal����ͬʱʵ���ڻ���·��IWalkable����
����Ӿ��ISwimable���Ľӿ�
��ҵĿ�ģ�
���սӿڵĶ���
���սӿںͽӿ�֮��Ķ�̳й�ϵ
���սӿں���֮��Ķ�ʵ�ֹ�ϵ

����:
(1)�ȴ���һ������(Frog)���ܺ͸���(Animal)��, ͨ��extends�̳�
(2)ͨ��interface���δ��������ӿ�IWalkable(��·), (IWimable)��Ӿ, (ISkill)������
(3)����ʵ����Frog
(4)����������FrogDemo, ����ʵ�ֶ���, ����ʵ���෽��

�ܽ�:
(1)�ӿڿ��Զ�̳нӿ�
(2)�ӿڼ���������֮�������
 */

package cn.onedell.swim_demo;

public class FrogDemo {

	public static void main(String[] args) {
		ISkill Frog = new Frog();
		Frog.walk();
		Frog.swim();
		

	}

}
