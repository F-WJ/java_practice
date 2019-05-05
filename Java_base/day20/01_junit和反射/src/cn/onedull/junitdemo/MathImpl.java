package cn.onedull.junitdemo;

public class MathImpl implements IMath{

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

}
