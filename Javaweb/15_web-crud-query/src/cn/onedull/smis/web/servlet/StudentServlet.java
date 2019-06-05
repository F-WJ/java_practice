package cn.onedull.smis.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.smis.domain.Student;
import cn.onedull.smis.query.StudentQueryObject;
import cn.onedull.smis.result.PageResult;
import cn.onedull.smis.service.IStudentService;
import cn.onedull.smis.service.impl.StudentServiceImpl;
import cn.onedull.smis.util.strUtil;

@WebServlet("/student")
public class StudentServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	IStudentService service = new StudentServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String cmd = req.getParameter("cmd");
		if("delete".equals(cmd)){
			delete(req, resp);
		}else if("edit".equals(cmd)){
			edit(req, resp);
		}else if("saveOrUpdate".equals(cmd)){
			saveOrUpate(req, resp);
		}else{
			list(req, resp);
		}
		
	}
	
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentQueryObject qo = new StudentQueryObject();
		//分页功能
		String currentPage = req.getParameter("currentPage");
		String pageSize = req.getParameter("pageSize");
		String studentName = req.getParameter("studentName");
		String minAge = req.getParameter("minAge");
		String maxAge = req.getParameter("maxAge");
		
		if(strUtil.hasLength(currentPage)){
			qo.setCurrentPage(Integer.valueOf(currentPage));
		}
		if(strUtil.hasLength(pageSize)){
			qo.setPageSize(Integer.valueOf(pageSize));
		}
		if(strUtil.hasLength(studentName)){
			qo.setStudentName(studentName);
		}
		if(strUtil.hasLength(minAge)){
			qo.setMinAge(Integer.valueOf(minAge));
		}
		if(strUtil.hasLength(maxAge)){
			qo.setMaxAge(Integer.valueOf(maxAge));
		}
		PageResult pageResult = service.query(qo);
		
		
		
		req.setAttribute("re", pageResult);
		req.setAttribute("qo", qo);
		req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);
	
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if(strUtil.hasLength(id)){
			service.delete(Long.valueOf(id));
		}
		
		
		resp.sendRedirect(req.getContextPath() + "/student");
		
	}
	
	
	protected void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if(strUtil.hasLength(id)){
			Student student = service.get(Long.valueOf(id));
			req.setAttribute("list", student);
			
		}
		
		req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
	}
	
	protected void saveOrUpate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Student student = new Student();
		if(strUtil.hasLength(id)){
			//update
			student.setId(Long.valueOf(id));
			setValue(req, student);
			service.update(student);
		}else{
			setValue(req, student);
			service.save(student);
		}
		
		resp.sendRedirect(req.getContextPath() + "/student");
	}

	private void setValue(HttpServletRequest req, Student student) {
		String name = req.getParameter("name");
		if(strUtil.hasLength(name)){
			student.setName(name);
		}
		String age = req.getParameter("age");
		if(strUtil.hasLength(age)){
			student.setAge(Integer.valueOf(age));
		}
		String clazz = req.getParameter("clazz");
		if(strUtil.hasLength(clazz)){
			student.setClazz(clazz);
		}
	}

	
}
