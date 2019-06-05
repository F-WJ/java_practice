package cn.onedull.pmis.web.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cn.onedull.pmis.domain.Product;
import cn.onedull.pmis.service.IProductService;
import cn.onedull.pmis.service.impl.ProductServiceImpl;
import cn.onedull.pmis.util.StrUtil;

@WebServlet("/product")
public class ProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	IProductService service = new ProductServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		//获取请求过来的cmd值
		String cmd = req.getParameter("cmd");
		//通过cmd值来决定执行那个操作
		if("delete".equals(cmd)){
			delete(req, resp);
		}else if("input".equals(cmd)){
			input(req, resp);
		}else if("saveOrUpdate".equals(cmd)){
			saveOrUpdate(req, resp);
		}else{
			list(req, resp);
		}
	}
	
	//主页
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> list = service.getAll();
		req.setAttribute("p", list);
		req.getRequestDispatcher("/WEB-INF/view/product/list.jsp").forward(req, resp);
		
	}
	
	//删除操作
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取参数id的值
		String strid = req.getParameter("id");
		Long id = Long.valueOf(strid);
		//同获取到的id来删除数据
		service.delete(id);
		
		//请求转发到主页(使用重定向，如果使用请求转发会陷入死循环)
		resp.sendRedirect(req.getContextPath() + "/product");
	}
	
	protected void input(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//跳转到信息录入界面
		
		String strid = req.getParameter("id");
		if(strid == null){
			req.getRequestDispatcher("/WEB-INF/view/product/input.jsp").forward(req, resp);
		}
		
		Long id = Long.valueOf(strid);
		Product p = service.get(id);
		req.setAttribute("p", p);
		req.getRequestDispatcher("/WEB-INF/view/product/input.jsp").forward(req, resp);
		
		
	}
	
	
	//添加和修改操作
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//商品名
		String productName = req.getParameter("productName");
		String strdir_id = req.getParameter("dir_id");
		Long dir_id = Long.valueOf(strdir_id);
		String salePrice = req.getParameter("salePrice");
		String supplier = req.getParameter("supplier");
		String brand = req.getParameter("brand");
		String strcutoff = req.getParameter("cutoff");
		Double cutoff = Double.valueOf(strcutoff);
		String costPrice = req.getParameter("costPrice");
		
		String strid = req.getParameter("id");
		if(StrUtil.hasLength(strid)){
			Long id = Long.valueOf(strid);
			Product p = new Product(id, productName, dir_id, new BigDecimal(salePrice), supplier, brand, cutoff, new BigDecimal(costPrice));
			service.update(p);
		}else{
			Product p = new Product(null, productName, dir_id, new BigDecimal(salePrice), supplier, brand, cutoff, new BigDecimal(costPrice));
			service.save(p);
		}
		resp.sendRedirect(req.getContextPath() + "/product");			

	}
	
	

}