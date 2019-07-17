package cn.wolfcode.trip.core.service.impl;

import cn.wolfcode.trip.core.domain.Region;
import cn.wolfcode.trip.core.mapper.RegionMapper;
import cn.wolfcode.trip.core.service.IRegionService;
import cn.wolfcode.trip.core.service.IVerifyCodeService;
import cn.wolfcode.trip.core.util.Constants;
import cn.wolfcode.trip.core.util.DateUtil;
import cn.wolfcode.trip.core.util.UserContext;
import cn.wolfcode.trip.core.vo.VerifyCodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;





@Service
public class RegionServiceImpl implements IRegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<Region> listByParentId(Long parentId) {
        return regionMapper.selectByParantId(parentId);
    }

    @Override
    public void save(Region region) {
        if("全部地区".equals(region.getParentName())){
            region.setParentName(null);
        }
        region.setState(0); //默认为不推荐
        regionMapper.insert(region);
    }

    @Override
    public void update(Region region) {
        regionMapper.updateByPrimaryKey(region);
    }

    @Override
    public void updateState(Long id, Integer state) {
        regionMapper.updateState(id, state);
    }
}
