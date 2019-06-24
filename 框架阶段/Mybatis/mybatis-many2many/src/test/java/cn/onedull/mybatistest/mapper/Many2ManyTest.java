package cn.onedull.mybatistest.mapper;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import cn.onedull.mybatistest.domain.Student;
import cn.onedull.mybatistest.domain.Teacher;
import cn.onedull.mybatistest.util.MyBatisUtil;

public class Many2ManyTest {

	@Test
	public void testSave() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类(学生和老师)
		TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		
		//老师
		Teacher teacher1 = new Teacher();
		teacher1.setName("李老师");
		Teacher teacher2 = new Teacher();
		teacher2.setName("杨老师");
		
		//学生
		Student student1 = new Student();
		student1.setName("小天");
		student1.getTeachers().add(teacher1);
		student1.getTeachers().add(teacher2);
		Student student2 = new Student();
		student2.setName("小爱");
		student2.getTeachers().add(teacher1);
		student2.getTeachers().add(teacher2);
		
		
		//保存老师
		teacherMapper.save(teacher1);
		teacherMapper.save(teacher2);
		
		//保存学生
		studentMapper.save(student1);
		studentMapper.save(student2);

		//学生与老师关联
		for (Teacher t : student1.getTeachers()) {
			studentMapper.insertRelationWithTeacher(student1.getId(),  t.getId());
		}
		for (Teacher t : student2.getTeachers()) {
			studentMapper.insertRelationWithTeacher(student2.getId(),  t.getId());
		}
		

		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
	@Test
	public void testGet() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类(学生)
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student student = studentMapper.get(3L);
		System.out.println(student);

		//释放资源
		session.close();
	}
	
	@Test
	public void testDelete() {
		SqlSession session = MyBatisUtil.getSession();
		//实现接口类(学生)
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		studentMapper.deleteRelationWithTeacher(3L);
		studentMapper.delete(3L);
		
		//提交
		session.commit();
		//释放资源
		session.close();
	}
	
}
