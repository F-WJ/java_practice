/*
2������һ�ٸ���ݴ��ɷ�����������Expresses ��Ϊ������Դ�࣬
������Ա�߳���Mailman ,�뿪�������߳��ɷ���100����ݣ�
����ӡ�ĸ����Ա�ɷ�����һ����ݡ����ӷ֣����ѣ�����Ҫ�󣩣���ӡ���xxһ���ɷ���xx����ݡ�


����:
(1)����һ����Expresses, ��Ա�������express(String����)
(2)�Զ�����Mailmanʵ��Rannable�ӿ�
(3)��main��������Mailman����
(4)����Thread�����, ���Զ�����Mailman������ΪThread�๹��������
(5)����start����
(6)ʹ��Thread�����join����, �ȴ��߳̽���

�ܽ�:
(1)join����:t.join()�����������ô˷������߳�(calling thread)��ֱ���߳�t��ɣ�
	���߳��ټ�����ͨ��������main()���߳��ڣ��ȴ������߳�����ٽ���main()���̡߳�
*/
package cn.onedull.expand02;

public class Demo {

	public static void main(String[] args) {
		//�������߳��ɷ���100�����
		Mailman mailman = new Mailman();
		Thread th1 = new Thread(mailman, "С��");
		Thread th2 = new Thread(mailman, "С��");
		Thread th3 = new Thread(mailman, "С��");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//��ӡ�ĸ����Ա�ɷ�����һ����ݡ�����ӡ���xxһ���ɷ���xx����ݡ�
		String[] name = Expresses.name.toString().split(",");
		String[] nameSum = Expresses.str.toString().split(",");
		for(int x = 0; x < name.length; x++) {
			int time = 0;
			for(int y = 0; y < nameSum.length; y++) {
				if(name[x].trim().equals(nameSum[y].trim())) {
					time++;
				}
			}
			System.out.println("���Ա" + name[x].trim() + "һ��������" + time + "�����");
		}

	

	}
	
	

}
