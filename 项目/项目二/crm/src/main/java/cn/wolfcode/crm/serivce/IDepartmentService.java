package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Department;
import cn.wolfcode.crm.qo.QueryObject;
import com.github.pagehelper.PageInfo;

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

    PageInfo query(QueryObject qo);
}
