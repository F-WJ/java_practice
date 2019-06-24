package _03_randomcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.pmis.util.StrUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String randomCode = req.getParameter("randomCode");
		System.out.println(randomCode);
		//对比
		Object attribute = req.getSession().getAttribute("RANDOMCODE_IN_SESSION");
		System.out.println(attribute);
		boolean equals = randomCode.equals(attribute);
		System.out.println(equals);
		if(!StrUtil.hasLength(randomCode)){
			if(!randomCode.equals(attribute)){
				req.setAttribute("errorMsg", "验证码错误");
			}else{
				//销毁session中的信息
				req.getSession().removeAttribute("RANDOMCODE_IN_SESSION");
				req.setAttribute("errorMsg", "登录成功，请稍等");
			}
		}
	
		req.getRequestDispatcher("login.jsp").forward(req, resp);
		
	}

}
