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
import cn.onedull.umis.service.IUserService;
import cn.onedull.umis.service.impl.UserServiceImpl;
import cn.onedull.umis.util.StrUtil;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	IUserService service = new UserServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String cmd = req.getParameter("cmd");
		if ("delete".equals(cmd)) {
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
	
	
	//主页
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> user = service.getAll();
		req.setAttribute("u", user);
		
		//返回
		req.getRequestDispatcher("/WEB-INF/view/user/list.jsp").forward(req, resp);
	}
	
	
	//删除(id)
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		service.delete(Long.valueOf(id));
		
		//返回
		resp.sendRedirect(req.getContextPath() + "/user");
	}
	
	
	//编辑和添加页面
	protected void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if(StrUtil.hasLength(id)){
			//编辑
			User user = service.get(Long.valueOf(id));
			req.setAttribute("u", user);
		}		
		req.getRequestDispatcher("/WEB-INF/view/user/edit.jsp").forward(req, resp);
	
		
	}
	
	//edit页面的跳转
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ParseException {
		//获取请求的id值（来做判断条件）
		String id = req.getParameter("id");
		User user = new User();
		//当id不存在或者为空的时候，执行save语句，相反执行update语句（id为空时，）
		if(StrUtil.hasLength(id)){
			//update
			user.setId(Long.valueOf(id));
			
			setValues(req, user);
			service.update(user);
	
		}else{
			//save
			setValues(req, user);
			service.save(user);
			
		}
		
		//返回首页（展示所有信息）
		resp.sendRedirect(req.getContextPath() + "/user");
	}


	private void setValues(HttpServletRequest req, User user) {
		String name = req.getParameter("name");
		//录入员工姓名
		if(StrUtil.hasLength(name)){
			user.setName(name);
		}
		String salary = req.getParameter("salary");
		//录入员工工资
		if(StrUtil.hasLength(salary)){
			user.setSalary(new BigDecimal(salary));
		}
		String hiredate = req.getParameter("hiredate");
		//录入入职时间
		if(StrUtil.hasLength(hiredate)){
			System.out.println(hiredate);
			try {
				//转换时间
				user.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(hiredate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

}
