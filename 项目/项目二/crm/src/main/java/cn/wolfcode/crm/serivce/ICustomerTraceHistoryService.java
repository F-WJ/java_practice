package cn.wolfcode.crm.serivce;

import cn.wolfcode.crm.domain.CustomerTraceHistory;
import cn.wolfcode.crm.qo.CustomerTraceHistoryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ICustomerTraceHistoryService {
    //保存
    void save(CustomerTraceHistory customerTraceHistory);
    //删除
    void delate(Long id);
    //修改
    void update(CustomerTraceHistory customerTraceHistory);
    //查单个
    CustomerTraceHistory get(Long id);
    //查多个
    List<CustomerTraceHistory> getAll();

    PageInfo query(CustomerTraceHistoryObject qo);
    
}
