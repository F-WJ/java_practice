package cn.onedull.practice._05;

/**
答案与解析

1.相关知识

&&为与操作符，如果第一个条件不成立， 则会直接判定为false， 不再判断后续

2.答案解析
首先定义了三个整型变量i、j、k初始值为0
for循环一共循环7次
前三次循环判断++i>3后就失败了跳出循环，每次i都加1
第四次循环时，条件成功判断++j>3，j同样为0,因此j开始前三次也失败
到第七次循环ij判定同时成功，k++>3判定失败，一直都没能通过if语句判断
但是循环次数已经结束
因此此时i判定循环了7次，j循环了7-3次，k循环了7-3-3次
值分别为7、4、1

 */
public class test {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		for(int x = 0; x < 7; x++){
			if(++i > 3 && (++j > 3) && (k++ > 3))
			{
				i++;
				++j;
				k++;
			}
		}
		System.out.println(i + "" + j + "" + k);
	}
}


