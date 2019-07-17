package cn.wolfcode.crm.mapper;

import cn.wolfcode.crm.domain.Systemdictionary;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.QueryObject;

import java.util.List;

public interface SystemdictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionary record);

    Systemdictionary selectByPrimaryKey(Long id);

    List<Systemdictionary> selectAll();

    int updateByPrimaryKey(Systemdictionary record);


    List<Systemdictionary> queryForList(QueryObject qo);


}