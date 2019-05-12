package cn.onedull.emis.dao.impl;

import java.util.List;

import cn.onedull.emis.dao.IEmployeeDAO;
import cn.onedull.emis.domain.Employee;
import cn.onedull.emis.util.Template;

public class EmployeeDAOImpl implements IEmployeeDAO{

	@Override
	public void save(Employee employee) {
		String sql = "INSERT employee(name, salary) VALUES(?, ?);";
		Template.dml(sql, employee.getName(), employee.getSalary());
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM employee WHERE id = ?";
		Template.dml(sql, id);
	}

	@Override
	public void update(Employee employee) {
		String sql = "UPDATE employee SET name= ?, salary= ? WHERE id = ?;";
		Template.dml(sql, employee.getName(), employee.getSalary(), employee.getId());
	}

	@Override
	public List<Employee> get(Employee employee, Long id) {
		String sql = "SELECT * FROM employee WHERE id = ?";
		List list = Template.dql(sql, Employee.class, id);
		return list;
	}

	@Override
	public List<Employee> get(Employee employee) {
		String sql = "SELECT * FROM employee";
		List list = Template.dql(sql, Employee.class);
		return list;
	}

}
