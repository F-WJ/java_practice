/*
需求:打印正三角形

思路:
(1)星星(奇数)1,3,5,7,9, 使用公式2*每一步-1
(2)空格数量总行 - 第几行

步骤:
(1)先定义总行数变量
(2)通过for和while嵌套循环

总结:
(1)其实用for+for来做嵌套组合也可以

*/
public class RegularTriangleDemo
{
	public static void main(String[] args)
	{
		int num = 5;
		for(int line = 1; line <= num; line++)
		{
			int blank = 1;
			int star = 1;
			while(blank <= num-line)
			{
				System.out.print(" ");
				blank++;
			}
			while(star <= 2*line-1)
			{
				System.out.print("*");
				star++;
			}
			System.out.println();
		}
		
	}
}