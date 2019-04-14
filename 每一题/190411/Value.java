package test3;

public class Value {
	public static void main(String[] args) {
		System.out.println(getValue(2));
	}

	private static int getValue(int i) {
		int result = 0;
		switch(i) {
			case 1 : result += 1;
			case 2 : result += i*2;
			case 3 : result += i*3;
		}
		return result;  //10
	}
}


/*
 * �������
 * 
 * 1.���֪ʶ
 * switch�������switch����еı���ֵ���ӱ���ֵ��case�������ֵλ�õ�case���֮��ʼִ�У�
 * ֱ��break�����ֲŻ�����switch��䡣
 * ������break����ǣ�switch�����ֹ��������ת��switch������������ִ�С�case��䲻����Ҫ����break��䡣
 * ���û��break�����֣���������ִ����һ��case��䣬ֱ������break��䡣 
 * 
 * 2.Դ�����
 * ��getValue���������˲���ֵ2����������ķ���ֵ getValue�����Ķ��壬������һ������result��������ʼֵΪ0
 * switch��䣬������Ĳ���ֵ��Ϊswitch���� case1��result���ϴ���Ĳ���ֵ case2��result���ϴ���Ĳ���ֵ����2
 * case3��result���ϴ���Ĳ���ֵ����3 ����resultֵ 
 * 
 * 3.�𰸽��� 
 * ����2����case2��ʼִ�У�result=0+2*2=4
 * û��break����ִ��case3��result=4+2*3=10 ��˷���ֵΪ10�����10
 */