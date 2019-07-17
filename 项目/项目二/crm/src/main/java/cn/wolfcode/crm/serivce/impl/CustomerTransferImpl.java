package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.CustomerTransfer;
import cn.wolfcode.crm.mapper.CustomerTransferMapper;
import cn.wolfcode.crm.qo.CustomerTransferObject;
import cn.wolfcode.crm.serivce.ICustomerTransferService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTransferImpl implements ICustomerTransferService {

    @Autowired
    private CustomerTransferMapper customerTransferMapper;



    @Override
    public void save(CustomerTransfer customerTransfer) {
        customerTransferMapper.insert(customerTransfer);
    }

    @Override
    public void delate(Long id) {
        customerTransferMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(CustomerTransfer customerTransfer) {
    customerTransferMapper.updateByPrimaryKey(customerTransfer);
    }

    @Override
    public CustomerTransfer get(Long id) {
        CustomerTransfer customerTransfer = customerTransferMapper.selectByPrimaryKey(id);
        return customerTransfer;
    }

    @Override
    public List<CustomerTransfer> getAll() {
        List<CustomerTransfer> customerTransfers = customerTransferMapper.selectAll();
        return customerTransfers;

    }

    @Override
    public PageInfo<CustomerTransfer> query(CustomerTransferObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize(), "ct.operate_time DESC");
        List<CustomerTransfer> list = customerTransferMapper.queryForList(qo);
        return new PageInfo<>(list);
    }

 
}
