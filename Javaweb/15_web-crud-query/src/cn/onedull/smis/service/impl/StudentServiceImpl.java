package cn.onedull.smis.service.impl;

import java.util.List;

import cn.onedull.smis.dao.IStudentDAO;
import cn.onedull.smis.dao.impl.StudentDAOImpl;
import cn.onedull.smis.domain.Student;
import cn.onedull.smis.query.StudentQueryObject;
import cn.onedull.smis.result.PageResult;
import cn.onedull.smis.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	IStudentDAO dao = new StudentDAOImpl();
	
	/**
	 * 分页
	 */
	@Override
	public PageResult query(StudentQueryObject qo) {
		//导入DAO层
		//创建结果
		PageResult pageResult;
		//获取总数据
		int totalCount = dao.queryForCount(qo);
		if(totalCount == 0){
			pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize());	
			System.out.println(qo.getCurrentPage());
		}else{
			List<Student> listData = dao.queryForList(qo);
			pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize(), listData, totalCount);
		}
		return pageResult;
	}
	
	/**
	 * 
	 * 保存
	 * 
	 */
	@Override
	public void save(Student student) {
		dao.save(student);
		
	}
	
	/**
	 * 删除
	 * 
	 */
	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}
	
	/**
	 * 
	 * 修改
	 */
	@Override
	public void update(Student student) {
		dao.update(student);
		
	}

	@Override
	public Student get(Long id) {
		Student student = dao.get(id);
		return student;
	}

}
