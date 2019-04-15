/*
方法的参数是引用类型:------>传递的是对象的地址值.
方法的返回值是引用类型:---->返回的是对象的地址值

类的成员变量修改问题
	1:先获得这个成员变量的值
	2:将这个成员变量值修改
	3:将修改后的值重新添加到对象中
	
	
方法的参数是引用类型(自定义类型),形式参数的修改影响实际参数
		因为方法传递的是对象的地址值,在两个引用变量指向相同地址值的时候,
		一方修改数据,另一方也会跟着修改.
 */
package cn.onedull.expand3;

public class TestDemo {
	public static void main(String[] args) {
		//定义一个数组并动态初始化
		int[] a = new int[3];
		//创建test对象
		Test1 test = new Test1();
		System.out.println("测试类中a值: " + a); // 测试类中a值: [I@659e0bfd
		test.setArr(a);
		System.out.println("返回arr值: " + test.getArr()); // 类中arr值: [I@659e0bfd
		
		
		System.out.println("--------------------------");
		
		Test2 t = new Test2();
		System.out.println("Test2 t值: " + t);
		Test1 test2 = new Test1(t);
		System.out.println("Test1 t值: " + test2.getTest2());
		t.setNum(1);
		System.out.println(t.getNum());
		
		
		
	}
}
