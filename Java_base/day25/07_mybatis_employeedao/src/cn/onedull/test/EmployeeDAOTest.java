package cn.onedull.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import javax.sound.midi.Synthesizer;

import org.junit.Test;

import cn.onedull.dao.IEmployeeDAO;
import cn.onedull.dao.impl.EmployeeDAOImpl;
import cn.onedull.domain.Employee;
/**
 * 
 * 总结：
 * 注意编写mapper文件的时候， 设置标签属性的时候，不能加入逗号， 都是用空格来隔开属性之间
 * 
 * 
 * 
 * @author FWJ
 *
 */
public class EmployeeDAOTest {
	private IEmployeeDAO ie = new EmployeeDAOImpl();
	
	@Test	
	public void testSave() {
		Employee employee = new Employee(null, "小凤", new BigDecimal("3000"));
		ie.save(employee);
	}

	@Test
	public void testDelete() {
		ie.delete(2L);
	}

	@Test
	public void testUpdate() {
		Employee employee = new Employee(1L, "小天", new BigDecimal("4000"));
		ie.update(employee);
	}

	@Test
	public void testGet() {
		Employee employee = ie.get(1L);
		System.out.println(employee);
	}

	@Test
	public void testGetAll() {
		List<Employee> list = ie.getAll();
		System.out.println(list);
		
	}

}
