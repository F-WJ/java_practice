package cn.onedull.expand03;

public class Gun {
	private int[] cartridge;
	
	public Gun() {
		cartridge = new int[5];
	}
	
	//装子弹方法
	public void push() {
		for(int i = 1; i <= cartridge.length; i++) {
			cartridge[i - 1] = i;
		}
	}
	
	//打出子弹方法(射击（没子弹不能射击），先装进的子弹先射击出去。)
	public void pop() {
		for(int i = cartridge.length - 1; i >= 0; i--) {
			System.out.println(cartridge[i]);
			if(i == 0) {
				System.out.println("没子弹了, 请重新装弹");
				//清零
				cartridge = new int[5];
				break;
			}
		}
	}
	
	public int[] getCartridge() {
		return cartridge;
	}
	public void setCartridge(int[] cartridge) {
		this.cartridge = cartridge;
	}
}

/*
 * Gun 里面有一个弹夹(int 类的数组)初始容量为 5， 
 * 还有一个装子弹的方法 push，打出子弹的方法 pop。
 */