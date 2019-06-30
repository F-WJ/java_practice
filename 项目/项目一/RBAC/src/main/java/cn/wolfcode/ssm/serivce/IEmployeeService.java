package cn.wolfcode.ssm.serivce;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.qo.EmployeeQueryObject;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;

import java.util.List;

public interface IEmployeeService {
    //保存
    void save(Employee employee);
    //删除
    void delate(Long id);
    //修改
    void update(Employee employee);
    //查单个
    Employee get(Long id);
    //查多个
    List<Employee> getAll();

    //查用户
    Employee login(String username, String password);

    PageResult query(EmployeeQueryObject qo);

    void relation(Long employeeId, Long roleId);

    List<Role> selectRelation(Long id);

    void delrelation(Long id);
}
