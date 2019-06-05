package cn.onedull._02_cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取请求
		//String username = req.getParameter("username");
		
		//获取Cookie
		Cookie[] cs = req.getCookies();
		String username = cs[0].getValue();
		
		req.setAttribute("username", username);
		req.setAttribute("content", "这是邮件内容");
		
		//请求转发
		req.getRequestDispatcher("/WEB-INF/view/content.jsp").forward(req, resp);
	}
	
}
