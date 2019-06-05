package cn.onedull.umis.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class QueryObject {
	//当前页
	private int currentPage = 1;
	//每页数据量
	private int PageSize = 3;
	
	
	//当前页索引
	public int getBeginIndex(){
		return (this.currentPage - 1) * this.PageSize;
		
	}
}
