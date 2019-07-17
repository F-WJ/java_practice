package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Systemdictionary;
import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ISystemdictionaryService {
    //保存
    void save(Systemdictionary systemdictionary);
    //删除
    void delate(Long id);
    //修改
    void update(Systemdictionary systemdictionary);
    //查单个
    Systemdictionary get(Long id);
    //查多个
    List<Systemdictionary> getAll();

    PageInfo query(QueryObject qo);


}
