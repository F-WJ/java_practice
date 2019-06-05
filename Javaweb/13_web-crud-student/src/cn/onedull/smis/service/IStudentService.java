package cn.onedull.smis.service;

import java.util.List;

import cn.onedull.smis.domain.Student;

public interface IStudentService {
	void save(Student student);
	void delete(Long id);
	void update(Student student);
	Student get(Long id);
	List<Student> getAll();
}
