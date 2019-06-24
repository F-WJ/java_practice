package cn.onedull.pmis.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginout")
public class LoginoutServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//清除session
		req.getSession().removeAttribute("USER_IN_SESSION");
		//返回登录页面
		resp.sendRedirect("/login");
	}

}
