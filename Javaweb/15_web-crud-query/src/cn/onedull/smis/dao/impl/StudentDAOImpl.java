package cn.onedull.smis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.onedull.smis.dao.IStudentDAO;
import cn.onedull.smis.domain.Student;
import cn.onedull.smis.query.StudentQueryObject;
import cn.onedull.smis.util.mybatisUtil;

public class StudentDAOImpl implements IStudentDAO {

	@Override
	public void save(Student student) {
		//创建对象
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		session.insert("cn.onedull.smis.mapper.StudentMapper.save", student);
		//提交
		session.commit();
		//释放资源
		session.close();
		

	}

	@Override
	public void delete(Long id) {
		//创建对象
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		session.insert("cn.onedull.smis.mapper.StudentMapper.delete", id);
		//提交
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public void update(Student student) {
		//创建对象
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		session.insert("cn.onedull.smis.mapper.StudentMapper.update", student);
		//提交
		session.commit();
		//释放资源
		session.close();

	}

	@Override
	public List<Student> queryForList(StudentQueryObject qo) {
		//创建对象
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		List<Student> listData = session.selectList("cn.onedull.smis.mapper.StudentMapper.queryForList", qo);
		//提交
		session.commit();
		//释放资源
		session.close();
		return listData;
	}

	@Override
	public int queryForCount(StudentQueryObject qo) {
		//创建对象
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		int totalCount = session.selectOne("cn.onedull.smis.mapper.StudentMapper.queryForCount", qo);
		//提交
		session.commit();
		//释放资源
		session.close();
		return totalCount;
	}

	@Override
	public Student get(Long id) {
		//创建对象
		SqlSession session = mybatisUtil.getSession();
		//执行sql
		Student student = session.selectOne("cn.onedull.smis.mapper.StudentMapper.get", id);
		//提交
		session.commit();
		//释放资源
		session.close();
		return student;
	}

}
