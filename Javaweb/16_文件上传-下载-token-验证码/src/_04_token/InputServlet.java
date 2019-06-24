package _04_token;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transfer")
public class InputServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取请求的值
		resp.setContentType("text/html; charset=utf-8");
		String money = req.getParameter("money");
		String token = req.getParameter("token");
		//System.out.println(token);
		
		//获取session的值
		Object tokenSession = req.getSession().getAttribute("TOKEN_IN_SESSION");
		//System.out.println(tokenSession);
		
		
		if(token.equals(tokenSession)){
			//销毁session中的数据
			System.out.println("扣" + money);
			//req.getSession().removeAttribute("TOKEN_IN_SESSION");
		}else{
			System.out.println("转账中，请稍等一下");
		}
			
		//模拟网络延迟
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//响应信息
		PrintWriter out = resp.getWriter();
		out.println("转账成功" + money);
	}
}
