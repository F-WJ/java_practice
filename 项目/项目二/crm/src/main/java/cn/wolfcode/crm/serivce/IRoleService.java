package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IRoleService {
    //保存
    void save(Role role);
    //删除
    void delate(Long id);
    //修改
    void update(Role role);
    //查单个
    Role get(Long id);
    //查多个
    List<Role> getAll();
    //查用户

    PageInfo<Role> query(QueryObject qo);

    //关联
    void relation(Long roleId, Long permissionId);
    //查权限值
    List<Permission> selectRelation(Long id);
    //删除操作
    void delrelation(Long id);
}
