/*
����:
(1)һ����55������,ÿҳ��ʾ10������,��ǰҳΪ2,�������һҳ
(2)һ����55������,ÿҳ��ʾ10������,��ǰҳΪ2,�������һҳ

����:
(1)����������,ÿҳ������,��ҳ��,��һҳ,��һҳ����
(2)ͨ�������ݺ�ÿҳ�����������������ҳ��
(3)ͨ����ǰҳ����0, ��ǰҳ���ڵ�����ҳ��,�������һҳ
(4)ͨ����ǰҳС��1, ��ǰҳС�ڵ�����ҳ��,�������һҳ

�ܽ�:
(1)���ʹ������&&��||���ص�
(2)�κ����͵����ݺ��ַ���������(+),��������ַ�������
*/
public class PageDemo
{
	public static void main(String[] args)
	{
		int data = 55;
		int page = 10;
		int currentpage = -10;
		
		//��ҳ��
		int amount = data % page == 0 ? data / page : data / page + 1;
		//��һҳ
		String uppage =  currentpage <= 0 || currentpage  >= amount ? "���,�����е��ߵ�" : "��һҳ: " +(currentpage + 1);
		//��һҳ
		String downpage = currentpage <= amount && currentpage > 1  ? "��һҳ: " + (currentpage - 1) : "���,�����е��ߵ�";
		//System.out.println(amount);
		System.out.println(uppage);
		System.out.println(downpage);
	}
}