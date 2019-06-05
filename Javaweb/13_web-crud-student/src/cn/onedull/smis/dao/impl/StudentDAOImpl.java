package cn.onedull.smis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.smis.dao.IStudentDAO;
import cn.onedull.smis.domain.Student;
import cn.onedull.smis.util.MybatisUtil;

public class StudentDAOImpl implements IStudentDAO {

	@Override
	public void save(Student student) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.smis.mapper.StudentMapper.save", student);
		session.commit();
		session.close();
	}

	@Override
	public void delete(Long id) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.smis.mapper.StudentMapper.delete", id);
		session.commit();
		session.close();
	}

	@Override
	public void update(Student student) {
		SqlSession session = MybatisUtil.getSession();
		session.insert("cn.onedull.smis.mapper.StudentMapper.update", student);
		session.commit();
		session.close();
	}

	@Override
	public Student get(Long id) {
		SqlSession session = MybatisUtil.getSession();
		Student student = session.selectOne("cn.onedull.smis.mapper.StudentMapper.get", id);
		session.commit();
		session.close();
		return student;
	}

	@Override
	public List<Student> getAll() {
		SqlSession session = MybatisUtil.getSession();
		List<Student> list = session.selectList("cn.onedull.smis.mapper.StudentMapper.getall");
		session.commit();
		session.close();
		return list;
	}

}
