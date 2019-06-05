package cn.onedull.smis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.onedull.smis.domain.Student;
import cn.onedull.smis.service.IStudentService;
import cn.onedull.smis.service.impl.StudentServiceImpl;

public class StudentServiceTest {
	IStudentService service =  new StudentServiceImpl();
	
	@Test
	public void testSave() {
		Student student = new Student(null, "小光", 18L, "6年6班");
		service.save(student);
	}

	@Test
	public void testDelete() {
		service.delete(2L);
	}

	@Test
	public void testUpdate() {
		Student student = new Student(1L, "小光", 18L, "7年6班");
		service.update(student);
	}

	@Test
	public void testGet() {
		Student student = service.get(1L);
		System.out.println(student);
	}

	@Test
	public void testGetAll() {
		List<Student> list = service.getAll();
		System.out.println(list);
		
	}

}
