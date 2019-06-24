package _02_download;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download")
public class FileDownLoadServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收用户需要下载的资源文件名
		String filename = req.getParameter("filename");
		//通过名称得到对应文件
		//获取绝对路径
		String baseDir = req.getServletContext().getRealPath("/WEB-INF/download/");
		System.out.println(baseDir + filename);
		
		//设置当前下载资源的名字（如果不设置默认download）
		resp.setHeader("Content-Disposition", "attachment;filename=" + filename);
		//获取对应文件
		Files.copy(Paths.get(baseDir,filename), resp.getOutputStream());
	}
	
	
	
}
