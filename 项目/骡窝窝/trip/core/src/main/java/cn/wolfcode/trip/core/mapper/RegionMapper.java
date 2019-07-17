package cn.wolfcode.trip.core.mapper;

import cn.wolfcode.trip.core.domain.Region;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Region record);

    Region selectByPrimaryKey(Long id);

    List<Region> selectAll();

    int updateByPrimaryKey(Region record);

    List<Region> selectByParantId(@Param("parentId") Long parentId);

    void updateState(@Param("id") Long id, @Param("state") Integer state);
}