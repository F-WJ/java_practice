package cn.onedull.expand03;

public class Gun {
	private int[] cartridge;
	
	public Gun() {
		cartridge = new int[5];
	}
	
	//װ�ӵ�����
	public void push() {
		for(int i = 1; i <= cartridge.length; i++) {
			cartridge[i - 1] = i;
		}
	}
	
	//����ӵ�����(�����û�ӵ��������������װ�����ӵ��������ȥ��)
	public void pop() {
		for(int i = cartridge.length - 1; i >= 0; i--) {
			System.out.println(cartridge[i]);
			if(i == 0) {
				System.out.println("û�ӵ���, ������װ��");
				//����
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
 * Gun ������һ������(int �������)��ʼ����Ϊ 5�� 
 * ����һ��װ�ӵ��ķ��� push������ӵ��ķ��� pop��
 */