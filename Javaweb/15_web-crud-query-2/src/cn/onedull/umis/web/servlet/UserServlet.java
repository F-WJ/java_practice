package cn.onedull.umis.web.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.umis.domain.User;
import cn.onedull.umis.query.UserQueryObject;
import cn.onedull.umis.result.PageResult;
import cn.onedull.umis.service.IUserService;
import cn.onedull.umis.service.impl.UserServiceImpl;
import cn.onedull.umis.util.strUtil;

@WebServlet("/user")
public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	IUserService service = new UserServiceImpl();
	
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//总控制室
		String cmd = req.getParameter("cmd");
		if("delete".equals(cmd)){
			delete(req, resp);
		}else if("edit".equals(cmd)){
			edit(req, resp);
		}else if("saveOrUpdate".equals(cmd)){
			try {
				saveOrUpdate(req, resp);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			list(req, resp);
		}
	}
	
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserQueryObject qo = new UserQueryObject();
		//分页功能
		String currentPage = req.getParameter("currentPage");
		String pageSize = req.getParameter("pageSize");
		
		String userName = req.getParameter("userName");
		String minSalary = req.getParameter("minSalary");
		String maxSalary = req.getParameter("maxSalary");
		
		if(strUtil.hasLength(currentPage)){
			qo.setCurrentPage(Integer.valueOf(currentPage));
		}
		if(strUtil.hasLength(pageSize)){
			qo.setPageSize(Integer.valueOf(pageSize));
		}
		if(strUtil.hasLength(userName)){
			qo.setUserName(userName);
		}
		if(strUtil.hasLength(minSalary)){
			qo.setMinSalary(new BigDecimal(minSalary));
		}
		if(strUtil.hasLength(maxSalary)){
			qo.setMaxSalary(new BigDecimal(maxSalary));
		}
		PageResult pageResult = service.query(qo);
		
		
		
		req.setAttribute("re", pageResult);
		req.setAttribute("qo", qo);
		req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);
		
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//拿id
		String id = req.getParameter("id");
		if(strUtil.hasLength(id)){
			service.delete(Long.valueOf(id));
		}
		
		resp.sendRedirect(req.getContextPath() + "/user");
	}
	
	protected void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//拿id
		String id = req.getParameter("id");
		if(strUtil.hasLength(id)){
			User user = service.get(Long.valueOf(id));
			req.setAttribute("list", user);
		}
		
		req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
	}
	
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ParseException {
		String id = req.getParameter("id");
		User user = new User();
		
		if(strUtil.hasLength(id)){
			//update
			user.setId(Long.valueOf(id));
			setValue(req, user);
			service.update(user);
		}else{
			//save
			setValue(req, user);
			service.save(user);
		}
		
		resp.sendRedirect(req.getContextPath() + "/user");
		
		
	}

	private void setValue(HttpServletRequest req, User user) throws ParseException {
		String name = req.getParameter("name");
		if(strUtil.hasLength(name)) {
			user.setName(name);
		}
		String salary = req.getParameter("salary");
		if(strUtil.hasLength(salary)) {
			user.setSalary(new BigDecimal(salary));
		}
		String hiredate = req.getParameter("hiredate");
		if(strUtil.hasLength(hiredate)) {
			user.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(hiredate));
		}
	}
	
	
	
	

}
