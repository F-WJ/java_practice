/*
按以下要求编写一个程序：
1)请用javaBean 规范设计一个学生类Student，具有：
属性：no(学号)、name(姓名)和score(成绩)
功能：输出一位学生的数据内容(toString)、计算学生的平均分(getAvg)
2)在main()方法中创建五个学生信息，并定义一个对象数组用于存储创建的五位学生
的数据，使用Student 类的getAvg 方法计算出这些学生的平均分；并打印所有学生的信息。

步骤:
(1)创建一个Student类,  3个private修饰的成员变量no(学号), name(姓名), score(成绩),  
	创建成员方法getAvg(使用for循环来计算每一个学生平均分), 
	覆盖原来toString方法,  修改成打印的是学生的信息.
(2)创建测试类Demo, 创建Student对象, 定义Student数组, 调用getAvg方法

总结:
(1)通过定义对象类型数组, 可以把所有对象的信息集合在一起, 方便处理一些操作, 例如某一字段的求和
*/

package cn.onedull.practice2;

public class Demo {

	public static void main(String[] args) {
		//创建对象
		int[] score1 = new int[]{80, 90, 60};
		Student student1 = new Student(1, "小文", score1);
		System.out.println(student1);
		int[] score2 = new int[]{80, 23, 60};
		Student student2 = new Student(2, "小风", score2);
		System.out.println(student2);
		int[] score3 = new int[]{80, 98, 60};
		Student student3 = new Student(3, "小聪", score3);
		System.out.println(student3);
		int[] score4 = new int[]{80, 45, 60};
		Student student4 = new Student(4, "小天", score4);
		System.out.println(student4);
		int[] score5 = new int[]{80, 67, 60};
		Student student5 = new Student(5, "小人", score5);
		System.out.println(student5);
		
		//定义一个学生类数组,并静态初始化
		Student[] stu = new Student[]{student1, student2, student3, student4, student5};
		//计算每一个学生的平均分, 并打印学生的信息
		Student.getAvg(stu);
		
	}
		
		

}

