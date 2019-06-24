package cn.onedull.pmis.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class QueryObject {
	//当前页的页数（默认1）
	private int currentPage = 1;
	//每页显示的数据（默认3）
	private int pageSize = 3;
	
	//当前页的开始索引值
	public int getBeginIndex(){
		return (currentPage - 1) * pageSize;
	}
}
