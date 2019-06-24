package cn.onedull.pmis.result;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageResult {
	//封装7个数据
	//当前页
	private int currentPage;
	//每页数据
	private int pageSize;
	//当前页的所有数据
	private List listDate;
	//总数据
	private int totalCount;
	//总页数
	private int totalPage;
	//上一页
	private int prevPage;
	//下一页
	private int nextPage;
	
	
	
	//有参构造器(没有数据)
	public PageResult(int currentPage, int pageSize) {
		this(currentPage, pageSize, new ArrayList(), 0);
	}
	
	
	//有参构造器(存在数据)
	public PageResult(int currentPage, int pageSize, List listDate, int totalCount) {
		//当前页
		this.currentPage = currentPage;
		//每页数据量
		this.pageSize = pageSize;
		//每页所有数据
		this.listDate = listDate;
		//总数据
		this.totalCount = totalCount;
		//总页数（总数据和每页数据除）
		this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
		//上一页（当前页 - 1）
		this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1 ;
		//下一页（当前页 + 1）
		this.nextPage =currentPage + 1 <= this.totalPage ? currentPage + 1 : this.totalPage;
	}

	
	
}
