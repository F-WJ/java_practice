/*
����ģ�������壨MotherBoard���ϰ�װ��꣨Mouse�������̣�KeyBoard���ȣ��Ƚ�û��
�淶���й淶������

����:
(1)����һ��ͨ�ýӿ�(IUSB), ���󷽷�Ϊusb
(2)��������ʵ�������(Miouse)�ͼ���(KeyBoard). ���ǽӿڵĳ��󷽷�
(3)����һ��������, ��������, ����������plugin����

�ܽ�:
(1)ͨ������һ��ͨ�õĽӿ�, ���ӹ淶��
 */

package cn.onedell.usb_demo;

public class Demo {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		KeyBoard kb = new KeyBoard();
		
		//����usb�ӿ�
		MotherBoard mb = new MotherBoard();
		mb.plugin(m);
		mb.plugin(kb);
		
		

	}

}
