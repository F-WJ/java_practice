package cn.onedull.pmis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.query.QueryObject;
import cn.onedull.pmis.result.PageResult;
import cn.onedull.pmis.service.IProductService;
import cn.onedull.pmis.service.impl.ProductServiceImpl;
import javafx.print.PageRange;

public class ProductServiceTest {
	IProductService service =  new ProductServiceImpl();
	
	@Test
	public void testQuery() {
		//获取两个sql的参数
		ProductQueryObject qo = new ProductQueryObject();
		//设置值
		qo.setCurrentPage(8);
		qo.setPageSize(3);
		//获取7个数据
		PageResult pageResult = service.query(qo);
		//获取当前页
		int currentPage = pageResult.getCurrentPage();
		System.out.println(currentPage);
		//获取每页数据量
		int pageSize = pageResult.getPageSize();
		System.out.println(pageSize);
		//获取当前页的数据
		List listDate = pageResult.getListDate();
		System.out.println(listDate);
		//获取总数据
		int totalCount = pageResult.getTotalCount();
		System.out.println(totalCount);
		//获取总页数
		int totalPage = pageResult.getTotalPage();
		System.out.println(totalPage);
		//获取上一页
		int prevPage = pageResult.getPrevPage();
		System.out.println(prevPage);
		//获取下一页
		int nextPage = pageResult.getNextPage();
		System.out.println(nextPage);
		
		
		
		
	}

}
