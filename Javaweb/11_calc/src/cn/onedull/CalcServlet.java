package cn.onedull;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置响应的MINE类型和编码（就是text/html）
		resp.setContentType("text/html; charset=UTF-8");
		
		//初始化值
		int ret = 0;
		Integer num1 = 0;
		Integer num2 = 0;
		
		//获取数据
		String str1 = req.getParameter("num1");
		String str2 = req.getParameter("num2");
		
		//判断是否存在值
		if (hasLength(str1) && hasLength(str2)) {
			//装换成integer类型
			num1 = Integer.valueOf(str1);
			num2 = Integer.valueOf(str2);
			
			//获取算术符号值
			String op = req.getParameter("op");
			//计算
			if("+".equals(op)){
				ret = num1 + num2;
			}else if("-".equals(op)){
				ret = num1 - num2;
			}else if("/".equals(op)){
				ret = num1 / num2;
			}else if("*".equals(op)){
				ret = num1 * num2;
			}
			
		}
		
		//反馈信息
		
		
		
		
		
	}
		
	//判断是否存在值
	private boolean hasLength(String val){
		return val != null && !"".equals(val.trim());
	}
}
