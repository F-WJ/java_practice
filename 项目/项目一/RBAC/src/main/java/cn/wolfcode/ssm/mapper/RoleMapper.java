package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    Role selectByPrimaryKey(Long id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);



    //查每页
    List<Role> queryForList(QueryObject qo);
    //总条数
    int queryForCount(QueryObject qo);
}