/*
需求:
(1)一共有55条数据,每页显示10条数据,当前页为2,请求出上一页
(2)一共有55条数据,每页显示10条数据,当前页为2,请求出下一页

步骤:
(1)定义总数据,每页数据量,总页数,下一页,上一页变量
(2)通过总数据和每页数据量的余来求得总页数
(3)通过当前页等于0, 当前页大于等于总页数,来求出下一页
(4)通过当前页小于1, 当前页小于等于总页数,来求出上一页

总结:
(1)灵活使用运用&&和||的特点
(2)任何类型的数据和字符串相连接(+),结果都是字符串类型
*/
public class PageDemo
{
	public static void main(String[] args)
	{
		int data = 55;
		int page = 10;
		int currentpage = -10;
		
		//总页数
		int amount = data % page == 0 ? data / page : data / page + 1;
		//下一页
		String uppage =  currentpage <= 0 || currentpage  >= amount ? "大哥,我是有底线的" : "下一页: " +(currentpage + 1);
		//上一页
		String downpage = currentpage <= amount && currentpage > 1  ? "上一页: " + (currentpage - 1) : "大哥,我是有底线的";
		//System.out.println(amount);
		System.out.println(uppage);
		System.out.println(downpage);
	}
}