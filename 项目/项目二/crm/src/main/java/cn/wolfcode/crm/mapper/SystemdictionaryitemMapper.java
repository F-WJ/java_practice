package cn.wolfcode.crm.mapper;

import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.qo.SystemdictionaryitemObject;

import java.util.List;

public interface SystemdictionaryitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionaryitem record);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    List<Systemdictionaryitem> selectAll();

    int updateByPrimaryKey(Systemdictionaryitem record);

    List<Systemdictionaryitem> queryForList(SystemdictionaryitemObject qo);

    List<Systemdictionaryitem> listItemByParentSn(String sn);
}