package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Systemdictionary;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.mapper.SystemdictionaryMapper;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.ISystemdictionaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemdictionaryServiceImpl implements ISystemdictionaryService {

    @Autowired
    private SystemdictionaryMapper systemdictionaryMapper;


    public void setSystemdictionaryMapper(SystemdictionaryMapper systemdictionaryMapper) {
    }

    @Override
    public void save(Systemdictionary systemdictionary) {
        systemdictionaryMapper.insert(systemdictionary);
    }

    @Override
    public void delate(Long id) {
        systemdictionaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Systemdictionary systemdictionary) {
    systemdictionaryMapper.updateByPrimaryKey(systemdictionary);
    }

    @Override
    public Systemdictionary get(Long id) {
        Systemdictionary systemdictionary = systemdictionaryMapper.selectByPrimaryKey(id);
        return systemdictionary;
    }

    @Override
    public List<Systemdictionary> getAll() {
        List<Systemdictionary> systemdictionarys = systemdictionaryMapper.selectAll();
        return systemdictionarys;

    }

    @Override
    public PageInfo<Systemdictionary> query(QueryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Systemdictionary> list = systemdictionaryMapper.queryForList(qo);
        return new PageInfo<>(list);
    }


}
