package cn.wolfcode.crm.mapper;

import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.qo.QueryObject;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    Permission selectByPrimaryKey(Long id);

    List<Permission> selectAll();

    int updateByPrimaryKey(Permission record);

    //查每页
    List<Permission> queryForList(QueryObject qo);
    //总条数
    int queryForCount(QueryObject qo);


    List<String> queryByEmployeeId(Long id);

    List<String> selectAllExpression();

}