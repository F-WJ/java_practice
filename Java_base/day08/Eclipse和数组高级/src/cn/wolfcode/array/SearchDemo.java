/*
 	需求：字符数组char[] arr={‘A’,‘1’,‘R’,‘!’,‘e’,‘&’,‘A’,‘5’,‘A’,‘g’,‘#’,‘D’}，请使用循环，统计出其中英文字
	母‘A’的个数。
	步骤:
	(1)定义一个char类型数组arr
	(2)使用for+if组合判断元素是否为'A'
	
	总结:
	(1)在char类型中, 65等价于'A'
 */
package cn.wolfcode.array;

public class SearchDemo {

	public static void main(String[] args) {
		//定义char类型并静态初始化
		char[] arr = new char[]{'A', '1', 'R' , '!' , 'e' , '&' , 'A' , '5' , 'A' , 'g' , '#' , 'D', 'a'};
		//for
		int sum = 0;
		for(char ele : arr)
		{
			//'A'等价于65
			if(ele == 65)
			{
				sum++;
			}
		}
		System.out.println(sum);

	}

}
