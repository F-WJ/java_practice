package cn.onedull.smis.result;

import java.util.ArrayList;
import java.util.List;

import cn.onedull.smis.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageResult {
	//7个数据
	//当前页
	private int currentPage;
	//每页显示数据数
	private int pageSize;
	//每页数据信息
	private List<Student> listData;
	//总数据量
	private int totalCount;
	//总页数
	private int totalPage;
	//上一页
	private int prevPage;
	//下一页
	private int nextPage;
	
	
	public PageResult(int currentPage, int pageSize) {
		this(currentPage, pageSize, new ArrayList(), 0);
		
	}


	public PageResult(int currentPage, int pageSize, List<Student> listData, int totalCount) {
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
