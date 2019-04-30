/*
需求：定义一个整型数组，将数组中的0 去掉后返回一个新数组。
例如：数组为int[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15}; 要求将以上数组中为0 的元素
去掉， 将不为0 的值存入一个新数组， 生成新的数组作为返回值: int[]
newArr={1,13,45,5,16,6,25,4,17,6,7,15};

思路:利用for( : ){}来循环, 再利用if语句判断, 如果为true, 插入新数组
*/
public class StatisticsDemo3
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
		int numzero = 0;
		int num = 0;
		
		//计算新数组元素总数
		for(int element : arr)
		{
			if(element != 0)
			{
				numzero++;
			}
		}
		int[] newarr = new int[numzero];

		//去0操作
		for(int element : arr)
		{
			//System.out.println(element);
			if(element != 0)
			{
				newarr[num] = element;
				num++;
			}
		}

		//打印新数组
		for(int element : newarr)
		{
			System.out.println(element);
		}
	}
}