/*
需求:
定义方法 输出传入数组元素中所有的 质数(只能被1 和 本身整除的数)  判断: 所有 

思路:
(1)质数 [2, num)
*/
public class ExpandDemo5
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4, 5, 7};
		//调用
		String str = ExpandDemo5.getPrime(arr);
		System.out.println(str);
	}

	static String getPrime(int[] arr)
	{
		String str = "";
		for(int ele : arr)
		{
			int count = 1;
			for(int index = 2; index < ele; index++)
			{
				if(ele % index == 0)
				{
					count = 0;
					break;
				}
			}
			if(count == 1 && ele != 1)
			{
				str = str + ele + ", "; 
			}
		}
		return str;
	}
}