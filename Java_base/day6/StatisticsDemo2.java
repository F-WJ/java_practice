/*
需求：定义一个方法接收一个int 类型的二维数组，返回数组元素值是0 的次数。
例如：数组：{{1,2,0,4,0}，{0,3,5}},结果为3

思路:
(1)先定义一个是sum(0的总数), 利用for(;;){},再利用for( : ){},并if语句, 如果元素为0,则加1 ,嵌套循环

总结:
(1)如果仅仅只需要获取数组的元素,可以直接使用foreach
*/

public class StatisticsDemo2
{
	public static void main(String[] args)
	{
		int num = 0;



		int[][] arr = new int[][]{{1, 2, 0, 4, 0}, {0, 3, 5}};
		for(int[] a : arr)
		{
			for(int b : a)
			{
				//System.out.println(b);
				if(b == 0)
				{
					num++;
				}
			}
			
		}
		System.out.println(num);
	}
}