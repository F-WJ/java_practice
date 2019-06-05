package cn.onedull.pmis.web.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.pmis.query.ProductQueryObject;
import cn.onedull.pmis.query.QueryObject;
import cn.onedull.pmis.result.PageResult;
import cn.onedull.pmis.service.IProductService;
import cn.onedull.pmis.service.impl.ProductServiceImpl;
import cn.onedull.pmis.util.StrUtil;

@WebServlet("/product")
public class ProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	IProductService service = new ProductServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		//获取pageResult的7个数据
		//QueryObject qo = new QueryObject();
		ProductQueryObject qo = new ProductQueryObject();
		
		//获取请求的值（当前页和每页数据）
		String currentPage = req.getParameter("currentPage");
		if(StrUtil.hasLength(currentPage)){
			qo.setCurrentPage(Integer.valueOf(currentPage));
		}
		String pageSize = req.getParameter("pageSize");
		if(StrUtil.hasLength(pageSize)){
			qo.setPageSize(Integer.valueOf(pageSize));
		}
		//获取请求的值（商品品，价格最小值， 价格最大值）
		String productName = req.getParameter("productName");
		if(StrUtil.hasLength(productName)){
			qo.setProductName(productName);
		}
		String minSalePrice = req.getParameter("minSalePrice");
		if(StrUtil.hasLength(minSalePrice)){
			qo.setMinSalePrice(new BigDecimal(minSalePrice));
		}
		String maxSalePrice = req.getParameter("maxSalePrice");
		if(StrUtil.hasLength(maxSalePrice)){
			qo.setMaxSalePrice(new BigDecimal(maxSalePrice));
		}
		
		
		//共享数据
		PageResult pageResult = service.query(qo);
		List p = pageResult.getListDate();
		req.setAttribute("p",  p);
		req.setAttribute("pr", pageResult);
		req.setAttribute("qo", qo);
		req.getRequestDispatcher("/WEB-INF/view/product/list.jsp").forward(req, resp);
	
	}

	
	
	

}
