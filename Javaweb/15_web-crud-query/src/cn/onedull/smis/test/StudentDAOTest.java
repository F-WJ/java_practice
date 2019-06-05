package cn.onedull.smis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.onedull.smis.dao.IStudentDAO;
import cn.onedull.smis.dao.impl.StudentDAOImpl;
import cn.onedull.smis.domain.Student;
import cn.onedull.smis.query.StudentQueryObject;

public class StudentDAOTest {
	IStudentDAO dao = new StudentDAOImpl();
	//模拟用户传递的两个参数（当前页和每页显示数据）
	StudentQueryObject qo =  new StudentQueryObject();
	
	@Test
	public void testSave() {
		Student student = new Student(null, "小明", 20, "7年2班");
		dao.save(student);
	}

	@Test
	public void testDelete() {
		dao.delete(5L);
	}

	@Test
	public void testUpdate() {
		Student student = new Student(3L, "小明", 20, "7年1班");
		dao.update(student);
	}

	@Test
	public void testQueryForList() {
		List<Student> listData = dao.queryForList(qo);
		System.out.println(listData);
	}

	@Test
	public void testQueryForCount() {
		int totalCount = dao.queryForCount(qo);
		System.out.println(totalCount);				
	}
	

}
