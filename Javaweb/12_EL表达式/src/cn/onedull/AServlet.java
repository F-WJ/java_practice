package cn.onedull;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el")
public class AServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person = new Person();
		Map<String, String> map = new HashMap<>();
		map.put("id", "01");
		map.put("ip", "127.0.0.1");
		person.setMap(map);
		//
		req.setAttribute("person", person);
		
		int num1 = 1;
		int num2 = 3;
		req.setAttribute("num2", num2);
		req.setAttribute("num1", num1);
		List<String> list = new ArrayList<>();
		list.add("1212");
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/el.jsp").forward(req, resp);
	}
	

}
