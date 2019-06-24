package cn.onedull._02_character;

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
		//获取请求过来的值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//设置session值
		req.getSession().setAttribute("listener", "123");
		//销毁session值
		req.getSession().removeAttribute("listener");
		//打印值
		System.out.println(username);
		System.out.println(password);
	}

}
