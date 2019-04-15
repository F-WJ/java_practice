/*
����: ��Դ�����д�ָ����λ�ø���ָ��λ�õ�Ԫ�ص�Ŀ�������ĳһλ����
����:
(1)�ȶ���5������,�ֱ���Դ����(src), Դ���鿪ʼ���Ƶ�����λ��(srcPos), 
      Ŀ������(destPos), �����Ƶ�Ԫ������(length)
(2)Դ����: ���ĸ�λ�ÿ�ʼ����
(3)Ŀ������: ���ĸ�λ�ÿ�ʼճ��
(3)���Ƶ�Ԫ������

�ܽ�:
(1)�ڱ�д����������֮�临�ƹ��ܵ�ʱ��, �����������������Χ
 */
package cn.wolfcode.array;


public class ArrayCopyDemo {

	public static void main(String[] args) {
		//Դ����
		int[] a = new int[]{10 ,20, 30, 40, 50, 60, 70};
		//Ŀ������
		int[] b = new int[7];
		
		//��ӡĿ����������Ԫ��
		System.out.println(java.util.Arrays.toString(b));
		//����ճ����ҪԪ�ص�Ŀ������(������ʽ: Դ����, ��ʼ��������,Ŀ������, ��ʼճ������, ����Ԫ������ )
		ArrayCopyDemo.arraycopy(a, 2, b, 4, 3);
		//�ٴδ�ӡĿ����������Ԫ��
		System.out.println(java.util.Arrays.toString(b));
		
		System.out.println("-----------------------------------");
		//java����API(��������Ԫ�ط���)
		System.out.println(java.util.Arrays.toString(b));
		System.arraycopy(a, 2, b, 4, 3);
		System.out.println(java.util.Arrays.toString(b));
		
		
	}
	
	//�Լ���������Ԫ�ط���
	static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length){
		//�жϿ�ʼ��������ֵ(srcPos)�Ƿ񳬹�Դ����Ԫ��������Χ
		if(srcPos > src.length){
			System.out.println(src.length);
			System.out.println("����Դ�����ܳ��ȷ�Χ");
		}
		//�ж��ܸ������Ƿ񳬹�Ŀ������Ԫ��������Χ
		if(destPos + length > dest.length){
			System.out.println("����Ŀ�������ܳ��ȷ�Χ");
		}
		for(int index = 0; index < length; index++){
			dest[destPos + index] = src[srcPos + index];
		}
	}

}
