package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Permission;
import cn.wolfcode.crm.domain.Role;
import cn.wolfcode.crm.mapper.RoleMapper;
import cn.wolfcode.crm.qo.PageResult;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.IRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    public void setRoleMapper(RoleMapper roleMapper) {
    }

    @Override
    public void save(Role role) {
        roleMapper.insert(role);
    }

    @Override
    public void delate(Long id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Role role) {
    roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public Role get(Long id) {
        Role role = roleMapper.selectByPrimaryKey(id);
        return role;
    }

    @Override
    public List<Role> getAll() {
        List<Role> roles = roleMapper.selectAll();
        return roles;

    }

    @Override
    public PageInfo<Role> query(QueryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Role> list = roleMapper.queryForList(qo);
        return new PageInfo<>(list);
    }

    @Override
    public void relation(Long roleId, Long permissionId) {
        roleMapper.relation(roleId, permissionId);
    }

    @Override
    public List<Permission> selectRelation(Long id) {
        List<Permission> permissions = roleMapper.selectRelation(id);
        return permissions;
    }

    @Override
    public void delrelation(Long id) {
        roleMapper.delrelation(id);
    }
}
