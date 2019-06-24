package cn.onedull.pmis.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.pmis.domain.User;
import cn.onedull.pmis.service.IUserService;
import cn.onedull.pmis.service.impl.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	IUserService service = new UserServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取值
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(password);
		//添加值
		User user = new User(name, password);
		System.out.println(user);
		//判断值
		try {
			//检测账号和密码
			User u = service.login(user);
			//共享session值（页面权限设置）
			req.getSession().setAttribute("USER_IN_SESSION", u);
			System.out.println(u);
			//重定向
			
			resp.sendRedirect("/product");
			
		} catch (Exception e) {
			//共享错误信息
			req.setAttribute("errorMsg", e.getMessage());
			//请求跳转
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}

}
