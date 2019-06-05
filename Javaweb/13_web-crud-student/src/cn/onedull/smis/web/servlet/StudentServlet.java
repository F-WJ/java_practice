package cn.onedull.smis.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.onedull.smis.dao.impl.StudentDAOImpl;
import cn.onedull.smis.domain.Student;
import cn.onedull.smis.service.IStudentService;
import cn.onedull.smis.service.impl.StudentServiceImpl;
import cn.onedull.smis.util.StrUtil;


@WebServlet("/student")
public class StudentServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	IStudentService service = new StudentServiceImpl();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String cmd = req.getParameter("cmd");
		//判断
		if("edit".equals(cmd)){
			edit(req, resp);
		}else if("saveToUpdate".equals(cmd)){
			saveToUpdate(req, resp);
		}else if("delete".equals(cmd)){
			delete(req, resp);
		}else{
			list(req, resp);
		}
	}
	
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//首页（查看所有数据）
		List<Student> s = service.getAll();
		req.setAttribute("s", s);
		req.getRequestDispatcher("/WEB-INF/view/student/list.jsp").forward(req, resp);
	}

	
	protected void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//登入页面
		String strid = req.getParameter("id");
		if(strid != null){
			Student student = service.get(Long.valueOf(strid));
			req.setAttribute("s", student);
			
		}
		req.getRequestDispatcher("/WEB-INF/view/student/edit.jsp").forward(req, resp);
	}

	
	protected void saveToUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//添加和修改
		String strid = req.getParameter("id");
		Student s = new Student();
		if(StrUtil.hasLength(strid)){
			//insert
			getValue(req, s);
			service.save(s);
		}else{
			//update
			s.setId(Long.valueOf(strid));
			getValue(req, s);
			service.update(s);
		}
		resp.sendRedirect(req.getContextPath() + "/student");

	}

	
	private void getValue(HttpServletRequest req, Student s) {
		String name = req.getParameter("name");
		if(StrUtil.hasLength(name)){
			s.setName(name);
		}
		String age = req.getParameter("age");
		if(StrUtil.hasLength(age)){
			s.setAge(Long.valueOf(age));
		}
		String clazz = req.getParameter("clazz");
		if(StrUtil.hasLength(clazz)){
			s.setClazz(clazz);
		}
	}
	
	
	
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//删除
		String strid = req.getParameter("id");
		service.delete(Long.valueOf(strid));
		
		resp.sendRedirect(req.getContextPath() + "/student");
		
	}





}
