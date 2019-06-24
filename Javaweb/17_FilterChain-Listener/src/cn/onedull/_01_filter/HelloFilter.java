package cn.onedull._01_filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//
		String decode = filterConfig.getInitParameter("decode");
		System.out.println(decode);
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("begin....");
		//允许进入
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		System.out.println("关闭");
		
	}

}
