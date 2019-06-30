package cn.wolfcode.ssm.serivce.impl;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.mapper.EmployeeMapper;
import cn.wolfcode.ssm.qo.EmployeeQueryObject;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;
import cn.wolfcode.ssm.serivce.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
    }

    @Override
    public void save(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void delate(Long id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Employee employee) {
    employeeMapper.updateByPrimaryKey(employee);
    }

    @Override
    public Employee get(Long id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = employeeMapper.selectAll();
        return employees;

    }

    @Override
    public Employee login(String username, String password) {
        return employeeMapper.login(username, password);
    }

    @Override
    public PageResult<Employee> query(EmployeeQueryObject qo) {
        PageResult pageResult;
        int totalCount = employeeMapper.queryForCount(qo);
        if(totalCount == 0){
            pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize());
        }else{
            List<Employee> listData = employeeMapper.queryForList(qo);
            pageResult = new PageResult<Employee>(qo.getCurrentPage(), qo.getPageSize(), listData, totalCount);
        }
        return pageResult;
    }

    @Override
    public void relation(Long employeeId, Long roleId) {
        employeeMapper.relation(employeeId, roleId);
    }

    @Override
    public List<Role> selectRelation(Long id) {
        List<Role> roles = employeeMapper.selectRelation(id);
        return roles;
    }

    @Override
    public void delrelation(Long id) {
        employeeMapper.delrelation(id);
    }
}
