/*
需求: 把源数组中从指定的位置复制指定位置的元素到目的数组的某一位置上
步骤:
(1)先定义5个变量,分别是源数组(src), 源数组开始复制的索引位置(srcPos), 
      目标数组(destPos), 所复制的元素总数(length)
(2)源数组: 从哪个位置开始复制
(3)目的数组: 从哪个位置开始粘贴
(3)复制的元素数量

总结:
(1)在编写数组与数组之间复制功能的时候, 请留意数组的索引范围
 */
package cn.wolfcode.array;


public class ArrayCopyDemo {

	public static void main(String[] args) {
		//源数组
		int[] a = new int[]{10 ,20, 30, 40, 50, 60, 70};
		//目标数组
		int[] b = new int[7];
		
		//打印目标数组所有元素
		System.out.println(java.util.Arrays.toString(b));
		//复制粘贴所要元素到目标数组(参数格式: 源数组, 开始复制索引,目标数组, 开始粘贴索引, 复制元素数量 )
		ArrayCopyDemo.arraycopy(a, 2, b, 4, 3);
		//再次打印目标数组所有元素
		System.out.println(java.util.Arrays.toString(b));
		
		System.out.println("-----------------------------------");
		//java本身API(拷贝数组元素方法)
		System.out.println(java.util.Arrays.toString(b));
		System.arraycopy(a, 2, b, 4, 3);
		System.out.println(java.util.Arrays.toString(b));
		
		
	}
	
	//自己拷贝数组元素方法
	static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length){
		//判断开始复制索引值(srcPos)是否超过源数组元素总数范围
		if(srcPos > src.length){
			System.out.println(src.length);
			System.out.println("超出源数组总长度范围");
		}
		//判断总复制量是否超过目标数组元素总数范围
		if(destPos + length > dest.length){
			System.out.println("超出目标数组总长度范围");
		}
		for(int index = 0; index < length; index++){
			dest[destPos + index] = src[srcPos + index];
		}
	}

}
