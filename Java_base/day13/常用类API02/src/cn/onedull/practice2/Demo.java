/*����������ӡ�淶���£�
��ĸСд��ӡ��ILowercaseLetter����������void printLowercaseLetter()
��ĸ��д��ӡ(IUppercaseLetter)��������printUppercaseLetter()
1)���д�ӡ��Print ʵ��ILowercaseLetter ��IUppercaseLetter �淶��
2)Ҫ�󸲸�printUppercaseLetter()����ʵ��Ϊ������Ա����str ת������ӡΪȫ��дӢ����ĸ
�Ĺ��ܣ�����printLowercaseLetter()����ʵ��Ϊ������Ա����str ת������ӡΪȫСдӢ����
ĸ�Ĺ��ܡ�
����ʾ�������65 ΪA�����97 Ϊa����
���ö�̬��֪ʶ�������󣬲����ô�Сд��ӡ������

����:
(1)����ILowercaseLetter��ILowercaseLetter�ӿ�
(2)����һ��Print��, ��ʵ��ILowercaseLetter ��IUppercaseLetter, ���������ӿڵĳ��󷽷�
(3)����һ��������Demo, ���ö�̬��������, ���÷���

�ܽ�:
(1)ʹ��String���toUpperCase��toLowerCase�������Կ����жϴ�Сд.
*/
package cn.onedull.practice2;

public class Demo {

	public static void main(String[] args) {
		String str = "dadasdad";
		//��������
		ILowercaseLetter lower = new Print();
		lower.printLowercaseLetter(str);
		IUppercaseLetter up = new Print();
		up.printUppercaseLetter(str);
	}

}
