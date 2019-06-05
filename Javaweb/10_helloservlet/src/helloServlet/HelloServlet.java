package helloServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements javax.servlet.Servlet{
	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化操作");
		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("hello, servlet");
		String servletName = config.getServletName();
		System.out.println(servletName);
		//指定编码
		String initParameter = config.getInitParameter("encoding");
		String encoding = initParameter;
		if("utf-8".equalsIgnoreCase(encoding)){
			System.out.println("你好");
		}else{
			System.out.println("hello");
		}
		
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
		
	}



}
