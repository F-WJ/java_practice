package cn.onedull;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//中文乱码问题（针对post）
		//方式一
		//String value = req.getParameter("name");
		//编码（tomcat默认使用了ISO-8859-1解码）
		//byte[] bytes = value.getBytes("ISO-8859-1");
		//String name = new String(bytes, "utf-8");
		//方式二（官方自带）
		req.setCharacterEncoding("utf-8");
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("age"));
		String[] hobby = req.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobby));
		
		
	}

}
