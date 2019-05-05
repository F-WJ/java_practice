package cn.onedull._01_anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VIP {
	/*步骤：
	 * 1. 设置@Target（注解可以放到哪个位置上）
	 * 2. 设置@Retention（设置注解的存活时期）
	 * 3. 定义抽象方法（属性）
	 * 
	 * 
	 * 总结
	 * 1.注解是一个特殊的接口， 在注解里， 属性名其实就是抽象方法名， 而属性值的类型就是抽象方法的返回值类型
	 * 2.注解中的属性名一般用名词
	 * 3.属性值的类型只能是：基本类型， 字符串， 字节码， 注解， 枚举 以及对应的一维数组
	 * 4.属性值可以覆盖原来的默认值
	 * 
	 */
	//基本类型
	int age();
	//Integer id();
	//String类型
	String name() default "小明";
	//数组类型
	String[] group() default {"1", "2"};
}
