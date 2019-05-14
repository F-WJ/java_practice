package cn.onedull.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import cn.onedull.dao.IEmployeeDAO;
import cn.onedull.domain.Employee;
import cn.onedull.util.MybatisUtil;

public class EmployeeDAOImpl implements IEmployeeDAO{

	@Override
	public void save(Employee employee) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.EmployeeMapper.save", employee);
		//提交
		session.commit();
		//释放
		session.close();
	}

	@Override
	public void delete(Long id) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.EmployeeMapper.save", id);
		//提交
		session.commit();
		//释放
		session.close();
		
	}

	@Override
	public void update(Employee employee) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		session.insert("cn.onedull.mapper.EmployeeMapper.update", employee);
		//提交
		session.commit();
		//释放
		session.close();
		
	}		

	@Override
	public Employee get(Long id) {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		Employee employee = session.selectOne("cn.onedull.mapper.EmployeeMapper.get", id);
		//提交
		session.commit();
		//释放
		session.close();
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		//获取session对象
		SqlSession session = MybatisUtil.getSession();
		//执行sql语句
		List<Employee> list = session.selectList("cn.onedull.mapper.EmployeeMapper.getall");
		//提交
		session.commit();
		//释放
		session.close();
		return list;
	}





}
