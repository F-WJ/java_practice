package cn.onedull.umis.result;

import java.util.ArrayList;
import java.util.List;

import cn.onedull.umis.domain.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PageResult {
	//业务数据(7个)
	
	//当前页
	private int currentPage;
	//每页数据
	private int pageSize;
	
	//每页数据信息
	private List<User> listData;
	//总条数
	private int totalCount;
	
	//总页数
	private int totalPage;
	//上一页
	private int prevPage;
	//上一页
	private int nextPage;
	public PageResult(int currentPage, int pageSize) {
		this(currentPage, pageSize, new ArrayList(), 0);
	}
	public PageResult(int currentPage, int pageSize, List<User> listData, int totalCount) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.listData = listData;
		this.totalCount = totalCount;
		
		//总页数
		this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1; 
		//上一页
		this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
		//下一页
		this.nextPage = currentPage + 1 <= this.totalPage ? currentPage + 1 : this.totalPage;
		
	}
	
	
	
	
	
}
