/*
2、现有一百个快递待派发，定义快递类Expresses 作为公共资源类，
定义快递员线程类Mailman ,请开启三个线程派发此100个快递，
并打印哪个快递员派发了哪一个快递。【加分（很难，不做要求）：打印快递xx一共派发了xx个快递】


步骤:
(1)定义一个类Expresses, 成员变量快递express(String类型)
(2)自定义类Mailman实现Rannable接口
(3)在main方法创建Mailman对象
(4)创建Thread类对象, 把自定义类Mailman对象作为Thread类构造器参数
(5)调用start方法
(6)使用Thread对象的join方法, 等待线程结束

总结:
(1)join方法:t.join()方法阻塞调用此方法的线程(calling thread)，直到线程t完成，
	此线程再继续；通常用于在main()主线程内，等待其它线程完成再结束main()主线程。
*/
package cn.onedull.expand02;

public class Demo {

	public static void main(String[] args) {
		//启三个线程派发此100个快递
		Mailman mailman = new Mailman();
		Thread th1 = new Thread(mailman, "小何");
		Thread th2 = new Thread(mailman, "小杰");
		Thread th3 = new Thread(mailman, "小钟");
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

		//打印哪个快递员派发了哪一个快递。【打印快递xx一共派发了xx个快递】
		String[] name = Expresses.name.toString().split(",");
		String[] nameSum = Expresses.str.toString().split(",");
		for(int x = 0; x < name.length; x++) {
			int time = 0;
			for(int y = 0; y < nameSum.length; y++) {
				if(name[x].trim().equals(nameSum[y].trim())) {
					time++;
				}
			}
			System.out.println("快递员" + name[x].trim() + "一共发送了" + time + "个快递");
		}

	

	}
	
	

}
