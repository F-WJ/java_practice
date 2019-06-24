package cn.onedull.mybatistest.mapper;





import org.apache.ibatis.annotations.Param;

import cn.onedull.mybatistest.domain.Student;




public interface StudentMapper {

	//保存
	void save(Student student);
	//查询
	Student get(Long id);
	//删除
	void delete(Long id);
	void deleteRelationWithTeacher(Long id);
	//维护关系
	void insertRelationWithTeacher(@Param("StudentId")Long studentId, @Param("TeacherId")Long TeacherId);
	

}
