package cn.wolfcode.crm.qo;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PageResult<T> {
	private int currentPage;
	private int pageSize;
	
	private List<T> listData;
	private int totalCount;
	
	private int totalPage;
	private int prevPage;
	private int nextPage;
	
	
	
	public PageResult(int currentPage, int pageSize) {
		this(currentPage, pageSize, new ArrayList(), 1);
	}



	public PageResult(int currentPage, int pageSize, List<T> listData, int totalCount) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.listData = listData;
		this.totalCount = totalCount;
		
		
		//总页
		this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize  : totalCount / pageSize + 1;
		
		this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
		this.nextPage = currentPage + 1 <= this.totalPage ? currentPage + 1 : this.totalPage ;
	}
	
	
	
	
}
