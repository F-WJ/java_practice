package cn.onedull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class AServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		req.setAttribute("date", date);
		
		List list = new ArrayList();
		list.add("123");
		list.add("456");
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/jstl.jsp").forward(req, resp);
	}

}
