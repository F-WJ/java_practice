class ParameterDemo1
{
	public static void main(String[] args)
	{
		int x = 10;
		System.out.println("main方法前, x=" + x);
		change(x);
		System.out.println("main方法后, x=" + x);
	}

	static void change(int x)
	{
		System.out.println("change方法前, x=" + x);
		x = 50;
		System.out.println("change方法后, x=" + x);
	}
}