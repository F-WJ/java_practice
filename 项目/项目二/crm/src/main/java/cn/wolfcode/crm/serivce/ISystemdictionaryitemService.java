package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.Systemdictionaryitem;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.qo.SystemdictionaryitemObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ISystemdictionaryitemService {
    //保存
    void save(Systemdictionaryitem systemdictionaryitem);
    //删除
    void delate(Long id);
    //修改
    void update(Systemdictionaryitem systemdictionaryitem);
    //查单个
    Systemdictionaryitem get(Long id);
    //查多个
    List<Systemdictionaryitem> getAll();

    PageInfo query(SystemdictionaryitemObject qo);

    List<Systemdictionaryitem> listItemByParentSn(String sn);
}
