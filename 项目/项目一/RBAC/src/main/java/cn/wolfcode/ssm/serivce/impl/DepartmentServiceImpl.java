package cn.wolfcode.ssm.serivce.impl;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.mapper.DepartmentMapper;
import cn.wolfcode.ssm.qo.PageResult;
import cn.wolfcode.ssm.qo.QueryObject;
import cn.wolfcode.ssm.serivce.IDepartmentService;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
    }

    @Override
    public void save(Department department) {
        departmentMapper.insert(department);
    }

    @Override
    public void delate(Long id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Department department) {
    departmentMapper.updateByPrimaryKey(department);
    }

    @Override
    public Department get(Long id) {
        Department department = departmentMapper.selectByPrimaryKey(id);
        return department;
    }

    @Override
    public List<Department> getAll() {
        List<Department> departments = departmentMapper.selectAll();
        return departments;

    }

    @Override
    public PageResult<Department> query(QueryObject qo) {
        PageResult pageResult;
        int totalCount = departmentMapper.queryForCount(qo);
        if(totalCount == 0){
            pageResult = new PageResult(qo.getCurrentPage(), qo.getPageSize());
        }else{
            List<Department> listData = departmentMapper.queryForList(qo);
            pageResult = new PageResult<Department>(qo.getCurrentPage(), qo.getPageSize(), listData, totalCount);
        }
        return pageResult;
    }
}
