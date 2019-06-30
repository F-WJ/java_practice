package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.Department;
import cn.wolfcode.ssm.qo.QueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    Department selectByPrimaryKey(Long id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);

    //查询数据
    List<Department> pagingData(@Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    //查每页
    List<Department> queryForList(QueryObject qo);
    //总条数
    int queryForCount(QueryObject qo);
}