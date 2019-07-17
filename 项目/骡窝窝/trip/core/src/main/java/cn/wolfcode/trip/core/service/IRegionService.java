package cn.wolfcode.trip.core.service;

import cn.wolfcode.trip.core.domain.Region;

import java.util.List;

public interface IRegionService {

    List<Region> listByParentId(Long parentId);

    void save(Region region);

    void update(Region region);

    void updateState(Long id, Integer state);
}
