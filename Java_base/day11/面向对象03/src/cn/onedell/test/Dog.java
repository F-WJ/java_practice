package cn.onedell.test;

//覆盖接口内容(实现类)
public class Dog implements Skill{
	public void run() {
		System.out.println("跑");
	}

	public void say() {
		System.out.println("汪汪汪");
	}
}
