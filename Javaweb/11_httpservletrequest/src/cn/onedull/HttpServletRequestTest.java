package cn.onedull;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class HttpServletRequestTest extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//返回请求方式(get.post之类的)
		System.out.println(req.getMethod());
		//返回请求行中的资源名
		System.out.println(req.getRequestURI());
		//返回完整url地址
		System.out.println(req.getRequestURL());
		//获取上下文路径（path值）
		System.out.println("上下文：" + req.getContextPath());
		//获取客户端ip地址
		System.out.println(req.getRemoteAddr());
		//获取客户端端口
		System.out.println(req.getRemotePort());
		//获取客户端用户
		System.out.println(req.getRemoteUser());
		//获取请求头的某一值信息
		System.out.println(req.getHeader("User-Agent"));
		//获取请求头所有信息
		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String nextElement = headerNames.nextElement();
			System.out.println(nextElement + ": " + req.getHeader(nextElement));
		}
		
		//模拟获取表单
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("age"));
		//获取多个值
		String[] pv = req.getParameterValues("hobby");
		System.out.println(Arrays.toString(pv));
		Enumeration<String> parameterNames = req.getParameterNames();
		
		
		
		
		
		
	}

}
