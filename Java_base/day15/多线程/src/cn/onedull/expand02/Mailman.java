package cn.onedull.expand02;

public class Mailman implements Runnable{
	
	
	public void run() {
			
			Expresses.name.append(Thread.currentThread().getName() + ",");
			while(true) {
				synchronized (this) {
					
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
					if(Expresses.express < 1) {
						System.out.println("����������");
						//System.out.println("����" + Expresses.str.toString());
						//System.out.println(Expresses.name.toString());
						
//						//��ӡ�ĸ����Ա�ɷ�����һ����ݡ�����ӡ���xxһ���ɷ���xx����ݡ�
//						String[] name = Expresses.name.toString().split(",");
//						String[] nameSum = Expresses.str.toString().split(",");
//						for(int x = 0; x < name.length - 1; x++) {
//							int time = 0;
//							for(int y = 0; x < nameSum.length - 1; y++) {
//								if(name[x].equals(nameSum[y])) {
//									time++;
//								}
//							}
//							System.out.println("���Ա" + name[x] + "һ��������" + time + "�����");
//						}
						
						break;
					}
					System.out.println(Thread.currentThread().getName() + "���Ա�ɷ��˱��" +  Expresses.express-- + "���");
					String name = Thread.currentThread().getName();
					Expresses.str.append(name + ",");
					
			}
				
				}
		
	}
}


//������Ա�߳���Mailman
//����ӡ�ĸ����Ա�ɷ�����һ����ݡ����ӷ֣����ѣ�����Ҫ�󣩣���ӡ���xxһ���ɷ���xx����ݡ�