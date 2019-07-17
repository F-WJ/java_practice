package cn.wolfcode.crm.serivce.impl;

import cn.wolfcode.crm.domain.Customer;
import cn.wolfcode.crm.mapper.CustomerMapper;
import cn.wolfcode.crm.qo.CustomerObject;
import cn.wolfcode.crm.qo.QueryObject;
import cn.wolfcode.crm.serivce.ICustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public void setCustomerMapper(CustomerMapper customerMapper) {
    }

    @Override
    public void save(Customer customer) {
        customerMapper.insert(customer);
    }

    @Override
    public void delate(Long id) {
        customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Customer customer) {
    customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public Customer get(Long id) {
        Customer customer = customerMapper.selectByPrimaryKey(id);
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = customerMapper.selectAll();
        return customers;

    }

    @Override
    public PageInfo<Customer> query(CustomerObject qo) {
        PageHelper.startPage(qo.getCurrentPage(), qo.getPageSize());
        List<Customer> list = customerMapper.queryForList(qo);
        return new PageInfo<>(list);
    }

    @Override
    public void updateCustomerStatus(Long customerId, Integer status) {
        customerMapper.updateCustomerStatus(customerId, status);
    }

    @Override
    public void updateSellerById(Long customerId, Long sellerId) {
        customerMapper.updateSellerById(customerId, sellerId);
    }

    @Override
    public void listBy(CustomerObject qo) {

    }
}
