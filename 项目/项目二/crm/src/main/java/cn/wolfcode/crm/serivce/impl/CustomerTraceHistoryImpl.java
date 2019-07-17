package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.CustomerTraceHistory;
import cn.wolfcode.crm.mapper.CustomerTraceHistoryMapper;
import cn.wolfcode.crm.qo.CustomerTraceHistoryObject;
import cn.wolfcode.crm.serivce.ICustomerTraceHistoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTraceHistoryImpl implements ICustomerTraceHistoryService {

    @Autowired
    private CustomerTraceHistoryMapper customerTraceHistoryMapper;



    @Override
    public void save(CustomerTraceHistory customerTraceHistory) {
        customerTraceHistoryMapper.insert(customerTraceHistory);
    }

    @Override
    public void delate(Long id) {
        customerTraceHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(CustomerTraceHistory customerTraceHistory) {
    customerTraceHistoryMapper.updateByPrimaryKey(customerTraceHistory);
    }

    @Override
    public CustomerTraceHistory get(Long id) {
        CustomerTraceHistory customerTraceHistory = customerTraceHistoryMapper.selectByPrimaryKey(id);
        return customerTraceHistory;
    }

    @Override
    public List<CustomerTraceHistory> getAll() {
        List<CustomerTraceHistory> customerTraceHistorys = customerTraceHistoryMapper.selectAll();
        return customerTraceHistorys;

    }

    @Override
    public PageInfo<CustomerTraceHistory> query(CustomerTraceHistoryObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize(), "cth.input_time DESC");
        List<CustomerTraceHistory> list = customerTraceHistoryMapper.queryForList(qo);
        return new PageInfo<>(list);
    }

 
}
