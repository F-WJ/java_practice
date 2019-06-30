package cn.wolfcode.ssm.serivce;

import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;

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

    PageResult query(QueryObject qo);
}
