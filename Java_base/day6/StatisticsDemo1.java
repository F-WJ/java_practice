/*
���󣺶���һ��int ���͵����飬����һ������Ϊ2 ���飬������0 λ�ô�Ų�������
ż������Ԫ��֮�ͣ�����1 λ�ô�Ų���������������Ԫ��֮�͡�
˼·��
(1)�½�����
(2)����forѭ��, if����ж��Ƿ�Ϊż��, ��������

�ܽ�:
(1)����������.length��ȡ���鳤��
(2)����forѭ��������������Ԫ��

�ܽ�:
(1)ע��forѭ����ʱ��, ����ĳ��Ⱥ��������ֵ�ǲ�һ����
*/
public class StatisticsDemo1
{
	public static void main(String[] args)
	{
		//����int��������
		int[] arr1 = new int[2];
		//Դ����
		int[] arr2 = new int[]{10, 20, 30, 40};
		//ż���ܺ�
		int sum1 = 0;
		//�����ܺ�
		int sum2 = 0;

		//forѭ����������
		for(int size = 0; size < arr2.length; size++)
		{
			//�ж��Ƿ���ż������
			if(size % 2 == 0)
			{
				sum1 = sum1 + arr2[size];
			}
			else
			{
				sum2 = sum2 + arr2[size];
			}
		}
		System.out.println(sum1 + ", " + sum2);
		//����Ԫ��ֵ
		arr1[0] = sum1;
		arr1[1] = sum2;
		
	}
}