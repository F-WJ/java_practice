package cn.onedull.smis.dao;

import java.util.List;

import cn.onedull.smis.domain.Student;
import cn.onedull.smis.query.StudentQueryObject;

public interface IStudentDAO {
	//保存
	void save(Student student);
	//删除
	void delete(Long id);
	//修改
	void update(Student student);
	//获取单条数据
	Student get(Long id);
	//查每页的数据
	List<Student> queryForList(StudentQueryObject qo);
	//查数据总数
	int queryForCount(StudentQueryObject qo);
	
	
}
