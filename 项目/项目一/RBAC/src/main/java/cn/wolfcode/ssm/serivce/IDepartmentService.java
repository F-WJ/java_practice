package cn.wolfcode.ssm.serivce;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;

import java.util.List;

public interface IDepartmentService {
    //保存
    void save(Department department);
    //删除
    void delate(Long id);
    //修改
    void update(Department department);
    //查单个
    Department get(Long id);
    //查多个
    List<Department> getAll();

    PageResult query(QueryObject qo);

}
