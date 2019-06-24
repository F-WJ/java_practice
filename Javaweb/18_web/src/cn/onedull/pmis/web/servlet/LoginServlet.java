package cn.onedull.pmis.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.pmis.domain.User;
import cn.onedull.pmis.service.IUserService;
import cn.onedull.pmis.service.impl.UserServiceImpl;
import cn.onedull.pmis.util.StrUtil;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	IUserService service = new UserServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//判断验证码
		String randomCode = req.getParameter("randomCode");
		Object sessionRandomCode = req.getSession().getAttribute("RANDOMCODE_IN_SESSION");
		System.out.println("test:"+ randomCode);
		if(StrUtil.hasLength(randomCode)){
			if(!randomCode.equals(sessionRandomCode)){
				req.setAttribute("errorMsg", "验证码错误");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
				return;
			}
		}
		
		//获取值
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		//添加值
		User user = new User(name, password);
		//判断值
		try {
			//检测账号和密码
			User u = service.login(user);
			//共享session值（页面权限设置）
			req.getSession().setAttribute("USER_IN_SESSION", u);
			
			//记住我功能
			String rememberMe = req.getParameter("rememberMe");
			System.out.println("re:" + rememberMe);
			//Boolean的vlanof方法只要是值不为null并true（大小不区分）就为true，其他判断为false
			if(Boolean.valueOf(rememberMe)){
				//设置cookie
				Cookie cookie = new Cookie("REMEMBER_IN_COOKIE", u.getName());
				//设置cookie时间
				cookie.setMaxAge(60 * 60 * 24);
				//响应给浏览器
				resp.addCookie(cookie);
			}
			
			
			//重定向
			resp.sendRedirect("/product.do");
			
		} catch (Exception e) {
			//共享错误信息
			req.setAttribute("errorMsg", e.getMessage());
			//请求跳转
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}

}
