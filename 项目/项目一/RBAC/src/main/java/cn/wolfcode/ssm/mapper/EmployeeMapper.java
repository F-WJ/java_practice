package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.qo.EmployeeQueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);

    Employee login(@Param("username") String username, @Param("password") String password);

    //查每页
    List<Employee> queryForList(EmployeeQueryObject eo);
    //总条数
    int queryForCount(EmployeeQueryObject eo);

    void relation(@Param("employeeId") Long employeeId, @Param("roleId") Long roleId);

    List<Role> selectRelation(Long id);

    void delrelation(Long id);
}