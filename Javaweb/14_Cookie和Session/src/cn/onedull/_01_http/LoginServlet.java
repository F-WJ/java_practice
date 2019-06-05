package cn.onedull._01_http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取请求数据
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		//设置共享数据
		req.setAttribute("username", username);
		
		req.getRequestDispatcher("/WEB-INF/view/main.jsp").forward(req, resp);
	}

}
