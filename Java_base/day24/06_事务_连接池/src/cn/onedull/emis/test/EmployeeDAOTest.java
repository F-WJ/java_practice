package cn.onedull.emis.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import cn.onedull.emis.dao.IEmployeeDAO;
import cn.onedull.emis.dao.impl.EmployeeDAOImpl;
import cn.onedull.emis.domain.Employee;
import cn.onedull.emis.util.JDBCUtil;
import cn.onedull.emis.util.Template;

public class EmployeeDAOTest {
	IEmployeeDAO ie = new EmployeeDAOImpl();
	
	@Test
	public void testSave() {
		Employee employee = new Employee(null,"小白",new BigDecimal("5454.887"));
		ie.save(employee);
		
	
	}

	@Test
	public void testDelete() {
		ie.delete(7L);
	}

	@Test
	public void testUpdate() {
		Employee employee = new Employee(1L,"小白",new BigDecimal("5454.887"));
		ie.update(employee);
	}

	@Test
	public void testGetEmployeeLong() {
		List<Employee> list = ie.get(new Employee(), 1L);
		System.out.println(list);
	}

	@Test
	public void testGetEmployee() {
		List<Employee> list = ie.get(new Employee());
		System.out.println(list);
	}

}
