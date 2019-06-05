package cn.onedull.smis.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueryObject {
	//当前页
	private int currentPage = 1;
	//每页显示多少数据
	private int pageSize = 3;
	
	//当前页的索引
	public int getBeginIndex(){
		return (this.currentPage - 1) * pageSize;
	}
	
}
