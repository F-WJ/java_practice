package cn.onedull._02_cookie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String username = req.getParameter("username");
		
		//获取Cookie
		Cookie[] cs = req.getCookies();
		String username = cs[0].getValue();
		//邮件
		List<String> list = Arrays.asList("邮件一", "邮件二", "邮件三");
		req.setAttribute("list", list);
		req.setAttribute("username", username);
		req.getRequestDispatcher("/WEB-INF/view/list.jsp").forward(req, resp);
	}
	
}
