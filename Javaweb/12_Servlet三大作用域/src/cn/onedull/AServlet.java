package cn.onedull;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialClob;

@WebServlet("/a")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取请求过来的值
		//String username = req.getParameter("username");
		//获取值(request)
		Object num = req.getAttribute("num");
		if (num == null) {
			//设置值
			req.setAttribute("num", 1);
		} else {
			//设置值
			req.setAttribute("num", (Integer)num + 1);
		}
		
	
		
		//session
		HttpSession session = req.getSession();
		Object sessionnum = session.getAttribute("sessionnum");
		if (sessionnum == null) {
			session.setAttribute("sessionnum", 1);
		} else {
			session.setAttribute("sessionnum", (Integer)sessionnum + 1);

		}
		//可以设置多个值
		session.setAttribute("sessionnum2", 3);
		
		//servletcontext
		ServletContext servletContext = super.getServletContext();
		
		Object contextnum = servletContext.getAttribute("contextnum");
		if (contextnum == null) {
			servletContext.setAttribute("contextnum", 1);
		} else {
			servletContext.setAttribute("contextnum", (Integer)contextnum + 1);

		}
		
		//请求转发
		req.getRequestDispatcher("/a.jsp").forward(req, resp);
		
	}

}
