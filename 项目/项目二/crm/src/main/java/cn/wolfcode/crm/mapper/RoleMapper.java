package cn.wolfcode.crm.mapper;

import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.qo.QueryObject;
import org.apache.ibatis.annotations.Param;

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

    //关联
    void relation(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);
    //查权限
    List<Permission> selectRelation(Long id);
    //删除关联
    void delrelation(Long id);


    List<String> queryRoleSnByEmpId(Long id);
}