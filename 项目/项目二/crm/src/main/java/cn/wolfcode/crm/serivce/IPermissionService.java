package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IPermissionService {
    //保存
    void save(Permission permission);
    //删除
    void delate(Long id);
    //修改
    void update(Permission permission);
    //查单个
    Permission get(Long id);
    //查多个
    List<Permission> getAll();
    //查用户

    PageInfo<Permission> query(QueryObject qo);

    void reload();

    void permissionSession(Employee employee);

    List<String> queryByEmployeeId(Long id);
}
