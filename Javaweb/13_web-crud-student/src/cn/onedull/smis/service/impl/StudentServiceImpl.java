package cn.onedull.smis.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.smis.dao.IStudentDAO;
import cn.onedull.smis.dao.impl.StudentDAOImpl;
import cn.onedull.smis.domain.Student;
import cn.onedull.smis.service.IStudentService;
import cn.onedull.smis.util.MybatisUtil;

public class StudentServiceImpl implements IStudentService {
	IStudentDAO dao = new StudentDAOImpl();
	
	@Override
	public void save(Student student) {
		dao.save(student);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public void update(Student student) {
		dao.update(student);
	}

	@Override
	public Student get(Long id) {
		Student student = dao.get(id);
		return student;
		
	}

	@Override
	public List<Student> getAll() {
		List<Student> list = dao.getAll();
		return list;
	}

}
