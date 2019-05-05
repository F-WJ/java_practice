package cn.onedull.junitdemo.test;

import org.junit.Test;

import cn.onedull.junitdemo.IMath;
import cn.onedull.junitdemo.MathImpl;
/**
 * 
 * 测试接口步骤:
 * 1.定义接口
 * 2.根据接口生成实现类
 * 3.根据接口生成测试类
 * 4.完成测试类
 * 
 * 总结:
 * 注意测试类名, 不能是直接Test, 不然@Test会就近原则, 导致报错
 * @author FWJ
 *
 */
public class MathTest {

	@Test
	public void testAdd() {
		//创建对象(多态)
		IMath m = new MathImpl();
		//调用方法
		m.add(3, 4);
	}

}
