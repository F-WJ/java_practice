/*���һ������getCpCode(double orderFee,String province) ������main �����е���,��ӡ��
getCpCode(80,�������С�)�ķ��ؽ��.
���ݶ������orderFee ���ջ���ʡ��province ���ж�ʹ���ļҿ�ݹ�˾,������������
������������128 ���ϻ����ǹ㶫ʡ���ջ���ַ,ֱ��ʹ��˳�����, �����ַ�����SF��,
������������58 ���ϲ����Ǳ����е��ջ���ַ,ֱ��ʹ��EMS ����,�����ַ�����EMS��,
�������Ĭ��Ϊ��ͨ���,�����ַ�����ZTO��

����:
(1)����һ��Demo��, ���һ��getCpCode����
(2)����if����String���quals�������ж�ʹ���ĸ���ݹ�˾

�ܽ�:
(1)�ж������ַ����Ƿ���ȵ�ʱ��, ʹ��equals����, ��Ҫʹ��==, ==���жϵ�ֵַ��
*/
package cn.onedull.practice3;

public class Demo {
	public static void main(String[] args) {
		String exp = Demo.getCpCode(9, "�㶫ʡ");
		System.out.println(exp);
	}
	
	static String getCpCode(double orderFee,String province) {
		if(orderFee > 128 || "�㶫ʡ".equals(province.trim())) {
			return "SF";
		}
		else if(orderFee < 58 && "������".equals(province.trim())) {
			return "EMS";
		}
		else {
			return "ZTO";
		}
	}
}
