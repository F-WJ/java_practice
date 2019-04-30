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
						System.out.println("快递派送完毕");
						//System.out.println("总量" + Expresses.str.toString());
						//System.out.println(Expresses.name.toString());
						
//						//打印哪个快递员派发了哪一个快递。【打印快递xx一共派发了xx个快递】
//						String[] name = Expresses.name.toString().split(",");
//						String[] nameSum = Expresses.str.toString().split(",");
//						for(int x = 0; x < name.length - 1; x++) {
//							int time = 0;
//							for(int y = 0; x < nameSum.length - 1; y++) {
//								if(name[x].equals(nameSum[y])) {
//									time++;
//								}
//							}
//							System.out.println("快递员" + name[x] + "一共发送了" + time + "个快递");
//						}
						
						break;
					}
					System.out.println(Thread.currentThread().getName() + "快递员派发了编号" +  Expresses.express-- + "快递");
					String name = Thread.currentThread().getName();
					Expresses.str.append(name + ",");
					
			}
				
				}
		
	}
}


//定义快递员线程类Mailman
//并打印哪个快递员派发了哪一个快递。【加分（很难，不做要求）：打印快递xx一共派发了xx个快递】