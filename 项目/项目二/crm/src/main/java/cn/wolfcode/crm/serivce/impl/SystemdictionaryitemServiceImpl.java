package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.mapper.SystemdictionaryitemMapper;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.qo.SystemdictionaryitemObject;
import cn.wolfcode.crm.serivce.ISystemdictionaryitemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemdictionaryitemServiceImpl implements ISystemdictionaryitemService {

    @Autowired
    private SystemdictionaryitemMapper systemdictionaryitemMapper;

    public void setSystemdictionaryitemMapper(SystemdictionaryitemMapper systemdictionaryitemMapper) {
    }

    @Override
    public void save(Systemdictionaryitem systemdictionaryitem) {
        systemdictionaryitemMapper.insert(systemdictionaryitem);
    }

    @Override
    public void delate(Long id) {
        systemdictionaryitemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Systemdictionaryitem systemdictionaryitem) {
        systemdictionaryitemMapper.updateByPrimaryKey(systemdictionaryitem);
    }

    @Override
    public Systemdictionaryitem get(Long id) {
        Systemdictionaryitem systemdictionaryitem = systemdictionaryitemMapper.selectByPrimaryKey(id);
        return systemdictionaryitem;
    }

    @Override
    public List<Systemdictionaryitem> getAll() {
        List<Systemdictionaryitem> systemdictionaryitems = systemdictionaryitemMapper.selectAll();
        return systemdictionaryitems;

    }

    @Override
    public PageInfo<Systemdictionaryitem> query(SystemdictionaryitemObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Systemdictionaryitem> list = systemdictionaryitemMapper.queryForList(qo);
        return new PageInfo<>(list);
    }

    @Override
    public List<Systemdictionaryitem> listItemByParentSn(String sn) {
        return systemdictionaryitemMapper.listItemByParentSn(sn);
    }
}
