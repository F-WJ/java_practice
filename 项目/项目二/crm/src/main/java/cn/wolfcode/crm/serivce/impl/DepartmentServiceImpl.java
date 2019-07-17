package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Department;
import cn.wolfcode.crm.mapper.DepartmentMapper;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.IDepartmentService;
import cn.wolfcode.crm.web.controller.DepartmentController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<Department> query(QueryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Department> list = departmentMapper.queryForList(qo);
        return new PageInfo<>(list);
    }
}
