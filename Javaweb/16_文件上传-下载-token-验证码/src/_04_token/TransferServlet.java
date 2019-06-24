package _04_token;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss")
public class TransferServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("TOKEN_IN_SESSION", UUID.randomUUID().toString());
		
		req.getRequestDispatcher("transfer.jsp").forward(req, resp);
	}

}
