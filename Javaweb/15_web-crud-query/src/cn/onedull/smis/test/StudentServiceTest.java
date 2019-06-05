package cn.onedull.smis.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.onedull.smis.query.StudentQueryObject;
import cn.onedull.smis.result.PageResult;
import cn.onedull.smis.service.IStudentService;
import cn.onedull.smis.service.impl.StudentServiceImpl;

public class StudentServiceTest {
	IStudentService serivce = new StudentServiceImpl();
	
	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testQuery() {
		//获取值
		StudentQueryObject qo = new StudentQueryObject();
		PageResult pageResult = serivce.query(qo);
		System.out.println(pageResult);
	}

}
