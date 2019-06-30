package cn.wolfcode.ssm.serivce.impl;

import cn.wolfcode.ssm.domain.Role;
import cn.wolfcode.ssm.mapper.RoleMapper;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;
import cn.wolfcode.ssm.serivce.IRoleService;
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
    public PageResult<Role> query(QueryObject qo) {
        PageResult pageResult;
        int totalCount = roleMapper.queryForCount(qo);
        if(totalCount == 0){
            pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize());
        }else{
            List<Role> listData = roleMapper.queryForList(qo);
            pageResult = new PageResult<Role>(qo.getCurrentPage(), qo.getPageSize(), listData, totalCount);
        }
        return pageResult;
    }
}
