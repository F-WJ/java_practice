package cn.onedull.smis.service;

import cn.onedull.smis.domain.Student;
import cn.onedull.smis.query.StudentQueryObject;
import cn.onedull.smis.result.PageResult;

public interface IStudentService {
	//保存
	void save(Student student);
	//删除
	void delete(Long id);
	//修改
	void update(Student student);
	//获取单条数据
	Student get(Long id);
	//分页操作
	PageResult query(StudentQueryObject qo);
}
